package msa.adaptive.member.domain.member.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import msa.adaptive.member.domain.member.model.value.MemberClassification;
import msa.adaptive.member.domain.member.model.value.MemberGrade;
import msa.adaptive.member.domain.member.model.value.MemberInfo;
import msa.adaptive.member.domain.member.model.value.MemberNo;
import msa.adaptive.member.domain.member.model.value.MemberStatus;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    private MemberNo memberNo;
    private MemberInfo memberInfo;
    private MemberGrade memberGrade;
    private MemberStatus memberStatus;
    private MemberClassification memberClassification;

}
