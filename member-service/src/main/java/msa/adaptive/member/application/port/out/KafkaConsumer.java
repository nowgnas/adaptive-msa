package msa.adaptive.member.application.port.out;

import msa.adaptive.member.domain.event.MemberCreatedEvent;

public interface KafkaConsumer {
    void consume(MemberCreatedEvent event);
}
