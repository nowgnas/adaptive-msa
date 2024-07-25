package msa.adaptive.member.application.port.in;

import msa.adaptive.member.adapter.in.web.response.MemberLoginResponse;
import msa.adaptive.member.adapter.in.web.request.CreateMemberCommand;

public interface CreateMemberUseCase {
     MemberLoginResponse createMember(CreateMemberCommand command);
}
