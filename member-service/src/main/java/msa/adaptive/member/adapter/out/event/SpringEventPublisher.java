package msa.adaptive.member.adapter.out.event;

import lombok.RequiredArgsConstructor;
import msa.adaptive.member.application.port.out.EventPublisher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpringEventPublisher implements EventPublisher {
  private final ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void publish(Object id) {}
}
