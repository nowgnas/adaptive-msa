package msa.adaptive.member.domain.member.application;

import lombok.RequiredArgsConstructor;
import msa.adaptive.member.domain.member.model.entity.Member;
import msa.adaptive.member.domain.member.model.value.MemberClassification;
import msa.adaptive.member.domain.member.model.value.MemberInfo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberJoinService {

    private final JoinByRule joinByRule;

    public void memberJoinByClassification(MemberInfo memberInfo,
            MemberClassification memberClassification) {
        Member member = joinByRule.applyJoinRule(memberInfo, memberClassification);
    }

}
