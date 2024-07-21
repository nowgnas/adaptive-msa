package msa.adaptive.member.domain.member.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import msa.adaptive.member.domain.member.exception.PasswordNotMatchException;
import msa.adaptive.member.domain.member.model.value.MemberClassification;
import msa.adaptive.member.domain.member.model.value.MemberGrade;
import msa.adaptive.member.domain.member.model.value.MemberInfo;
import msa.adaptive.member.domain.member.model.value.MemberNo;
import msa.adaptive.member.domain.member.model.value.MemberStatus;
import msa.adaptive.member.domain.member.model.value.Password;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    private MemberNo memberNo;
    private Password password;
    private MemberInfo memberInfo;
    private MemberGrade memberGrade;
    private MemberStatus memberStatus;
    private MemberClassification memberClassification;

    public static Member convertMemberInformation(String s) {
        return Member.builder().memberInfo(MemberInfo.builder().name(s).build()).build();
    }

    public void changePassword(String currentPassword, String newPassword) {
        if (!password.match(currentPassword)) {
            throw new PasswordNotMatchException();
        }
        this.password = Password.getNewInstance(newPassword);
    }
}
