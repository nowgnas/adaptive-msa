package msa.adaptive.member.application.service;

import lombok.RequiredArgsConstructor;
import msa.adaptive.member.application.port.in.CreateMemberUseCase;
import msa.adaptive.member.application.port.in.GetMemberUseCase;
import msa.adaptive.member.application.port.out.EventPublisher;
import msa.adaptive.member.application.port.out.MemberRepository;
import msa.adaptive.member.application.port.out.MemberServiceClient;
import msa.adaptive.member.domain.event.MemberCreatedEvent;
import msa.adaptive.member.domain.model.CreateMemberCommand;
import msa.adaptive.member.domain.model.entity.Member;
import msa.adaptive.member.domain.model.value.MemberId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements CreateMemberUseCase, GetMemberUseCase {
  private final MemberRepository memberRepository;
  private final EventPublisher eventPublisher;
  private final MemberServiceClient memberServiceClient;

  @Override
  public MemberId createMember(CreateMemberCommand command) {
    memberRepository.save(Member.builder().build());
    eventPublisher.publish(MemberCreatedEvent.getEvent("id"));
    return null;
  }

  @Override
  public Member getMember(Long id) {
    return null;
  }
}
