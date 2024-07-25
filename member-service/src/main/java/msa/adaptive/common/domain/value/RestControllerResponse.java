package msa.adaptive.common.domain.value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import msa.adaptive.member.adapter.in.web.response.MemberLoginResponse;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestControllerResponse<T> {
  private String message;
  private Integer code;
  private T data;
  private ErrorResponse error;

  public static RestControllerResponse<MemberLoginResponse> of(
      MemberLoginResponse memberLoginResponse) {
    return RestControllerResponse.<MemberLoginResponse>builder()
        .data(memberLoginResponse)
        .code(200)
        .build();
  }

  public static RestControllerResponse<MemberLoginResponse> of(
      MemberLoginResponse memberLoginResponse, String message) {
    return RestControllerResponse.<MemberLoginResponse>builder()
        .data(memberLoginResponse)
        .code(200)
        .message(message)
        .build();
  }
}
