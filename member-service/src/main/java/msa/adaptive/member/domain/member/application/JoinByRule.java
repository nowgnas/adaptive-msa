package msa.adaptive.member.domain.member.application;

import msa.adaptive.member.domain.member.model.entity.Member;
import msa.adaptive.member.domain.member.model.value.MemberClassification;
import msa.adaptive.member.domain.member.model.value.MemberInfo;

public interface JoinByRule {
    Member applyJoinRule(MemberInfo memberInfo, MemberClassification memberClassification);
}
