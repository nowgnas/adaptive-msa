package msa.adaptive.member.application.port.in;

import msa.adaptive.member.domain.model.entity.Member;

public interface GetMemberUseCase {
    Member getMember(Long id);
}