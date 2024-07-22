package msa.adaptive.member.domain.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import msa.adaptive.common.domain.value.Audit;
import msa.adaptive.member.domain.model.value.MemberClassification;
import msa.adaptive.member.domain.model.value.MemberId;
import msa.adaptive.member.domain.model.value.MemberInfo;
import msa.adaptive.member.domain.model.value.MemberStatus;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Member {
  private MemberId memberId;
  private MemberInfo memberInfo;
  private Audit audit;
  private MemberStatus memberStatus;
  private MemberClassification memberClassification;
}
