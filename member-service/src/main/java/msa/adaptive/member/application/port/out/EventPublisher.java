package msa.adaptive.member.application.port.out;

import org.springframework.stereotype.Component;

public interface EventPublisher {

    void publish(Object id);
}
