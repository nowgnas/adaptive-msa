package msa.adaptive.member.domain.member.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import msa.adaptive.member.domain.member.model.entity.Member;
import msa.adaptive.member.domain.member.model.value.MemberClassification;
import msa.adaptive.member.domain.member.model.value.MemberInfo;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberJoinByRule implements JoinByRule {


    @Override
    public Member applyJoinRule(MemberInfo memberInfo, MemberClassification memberClassification) {
        return null;
    }
}
