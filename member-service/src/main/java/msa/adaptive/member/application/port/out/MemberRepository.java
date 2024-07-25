package msa.adaptive.member.application.port.out;

import java.util.Optional;
import msa.adaptive.member.domain.model.entity.Member;
import msa.adaptive.member.domain.model.value.MemberId;
import org.springframework.stereotype.Repository;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(MemberId memberId);
}
