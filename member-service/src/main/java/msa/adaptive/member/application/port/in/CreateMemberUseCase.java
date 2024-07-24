package msa.adaptive.member.application.port.in;

import msa.adaptive.member.domain.model.CreateMemberCommand;
import msa.adaptive.member.domain.model.value.MemberId;

public interface CreateMemberUseCase {
     MemberId createMember(CreateMemberCommand command);
}
