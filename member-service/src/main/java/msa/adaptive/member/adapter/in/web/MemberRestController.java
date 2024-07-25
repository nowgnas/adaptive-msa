package msa.adaptive.member.adapter.in.web;

import lombok.RequiredArgsConstructor;
import msa.adaptive.common.domain.value.RestControllerResponse;
import msa.adaptive.member.adapter.in.web.response.MemberLoginResponse;
import msa.adaptive.member.application.port.in.CreateMemberUseCase;
import msa.adaptive.member.application.port.in.GetMemberUseCase;
import msa.adaptive.member.adapter.in.web.request.CreateMemberCommand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/general")
public class MemberRestController {
  private final CreateMemberUseCase createMemberUseCase;
  private final GetMemberUseCase getMemberUseCase;

  @PostMapping("/join")
  public RestControllerResponse<MemberLoginResponse> joinMember(
      @RequestBody CreateMemberCommand command) {
    MemberLoginResponse member = createMemberUseCase.createMember(command);
    return RestControllerResponse.of(member);
  }
}
