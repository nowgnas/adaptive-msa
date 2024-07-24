package msa.adaptive.member.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import msa.adaptive.member.domain.model.value.MemberId;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberCreatedEvent {
  private MemberId memberId;

  public static Object getEvent(String id) {
    return new Object();
  }
}
