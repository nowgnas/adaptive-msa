package msa.adaptive.member.adapter.out.persistence;

import java.util.Optional;
import msa.adaptive.member.application.port.out.MemberRepository;
import msa.adaptive.member.domain.model.entity.Member;
import msa.adaptive.member.domain.model.value.MemberId;

public class JpaMemberRepository implements MemberRepository {

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(MemberId memberId) {
        return Optional.empty();
    }
}
