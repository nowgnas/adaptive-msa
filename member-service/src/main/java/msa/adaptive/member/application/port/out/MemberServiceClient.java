package msa.adaptive.member.application.port.out;

import msa.adaptive.member.domain.model.dto.request.MemberDto;

public interface MemberServiceClient {
    MemberDto getMemberById(String memberId);
}
