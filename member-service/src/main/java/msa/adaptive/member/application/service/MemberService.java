package msa.adaptive.member.application.service;

import lombok.RequiredArgsConstructor;
import msa.adaptive.member.adapter.in.web.request.CreateMemberCommand;
import msa.adaptive.member.adapter.in.web.response.MemberLoginResponse;
import msa.adaptive.member.application.port.in.CreateMemberUseCase;
import msa.adaptive.member.application.port.in.GetMemberUseCase;
import msa.adaptive.member.application.port.out.EventPublisher;
import msa.adaptive.member.application.port.out.MemberRepository;
import msa.adaptive.member.domain.event.MemberCreatedEvent;
import msa.adaptive.member.domain.model.entity.Member;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements CreateMemberUseCase, GetMemberUseCase {
  private final MemberRepository memberRepository;
  private final EventPublisher eventPublisher;

  @Override
  public MemberLoginResponse createMember(CreateMemberCommand command) {
    memberRepository.save(Member.builder().build());
    eventPublisher.publish(MemberCreatedEvent.getEvent("id"));
    return null;
  }

  @Override
  public Member getMember(Long id) {
    return null;
  }
}
