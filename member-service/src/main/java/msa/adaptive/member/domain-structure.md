
### package example 
```
com.yourcompany.memberservice
│
├── application
│   ├── service
│   │   └── MemberService.java
│   ├── port
│   │   ├── input
│   │   │   └── GetMemberQuery.java
│   │   └── output
│   │       └── LoadMemberPort.java
│   └── usecase
│       └── GetMemberUseCase.java
├── domain
│   ├── model
│   │   └── Member.java
│   ├── repository
│   │   └── MemberRepository.java
│   └── service
│       └── MemberDomainService.java
├── infrastructure
│   ├── adapter
│   │   ├── input
│   │   │   └── MemberController.java
│   │   └── output
│   │       └── MemberPersistenceAdapter.java
│   ├── config
│   │   └── MemberServiceConfig.java
│   └── persistence
│       └── JpaMemberRepository.java
└── interfaces
    ├── web
    │   └── MemberRestController.java
    └── dto
        └── MemberDto.java

```

application.service

MemberService.java: 애플리케이션 서비스로, 비즈니스 로직을 구현합니다.
application.port.input

GetMemberQuery.java: 입력 포트 인터페이스로, 클라이언트가 사용할 서비스 메소드를 정의합니다.
application.port.output

LoadMemberPort.java: 출력 포트 인터페이스로, 외부 시스템과의 상호작용을 정의합니다.
application.usecase

GetMemberUseCase.java: 특정 유스케이스를 처리하는 애플리케이션 로직을 정의합니다.
domain.model

Member.java: 도메인 엔티티로, 멤버의 속성과 비즈니스 로직을 포함합니다.
domain.repository

MemberRepository.java: 도메인 레포지토리 인터페이스로, 멤버 데이터를 영속화하는 메소드를 정의합니다.
domain.service

MemberDomainService.java: 도메인 서비스로, 복잡한 비즈니스 로직을 처리합니다.
infrastructure.adapter.input

MemberController.java: 입력 어댑터로, REST API 요청을 처리합니다.
infrastructure.adapter.output

MemberPersistenceAdapter.java: 출력 어댑터로, 도메인 레포지토리를 구현합니다.
infrastructure.config

MemberServiceConfig.java: 서비스 설정 클래스입니다.
infrastructure.persistence

JpaMemberRepository.java: JPA 레포지토리 구현체입니다.
interfaces.web

MemberRestController.java: 외부 시스템과의 REST 인터페이스를 제공합니다.
interfaces.dto

MemberDto.java: 데이터 전송 객체로, 데이터를 주고받을 때 사용합니다.