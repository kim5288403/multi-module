# 멀티 모듈 싱글 프로젝트 With Java + Hexagonal

이 프로젝트는  QueryDSL, Java + Spring Boot, 그리고 Hexagonal Architecture 를 사용하여 개발된 멀티 모듈 싱글 프로젝트입니다.

## 프로젝트 설명

멀티 모듈 싱글 프로젝트의 주요 목적은 모놀리틱 아키텍처에서 MSA(Microservices Architecture)로의 전환 또는 그 반대로, MSA에서 모놀리틱 아키텍처로의 전환을 효율적으로 지원하는 것과 소프트웨어 개발 및 유지보수의 효율성을 극대화하고 이상적인 클린 아키텍처를 구성하기 위함입니다.

---

## 🛠 **개발 환경**

- 언어: Java 17
- 프레임워크: Spring Boot 3.1.4
- 빌드 도구: Gradle 7.6
- QueryDSL 5.0.0
- 데이터베이스: MySQL 8.0.33
- 테스트 데이터베이스: H2 Database
    
    ---
    

## 👨‍💻 **소프트웨어 설계 및 개발**

- 멀티 모듈 싱글 프로젝트
- Hexagonal Architecture
- 도메인 주도 개발 (DDD)
- 테스트 주도 개발 (TDD)

---

## 🖥 주요 개발 내용

### 멀티 모듈 싱글 프로젝트의 주요 개발 내용은 다음과 같습니다.

- **Multi Module**
    - **모듈 설계 및 정의:** 프로젝트의 기능을 적절한 비즈니스 도메인이나 서비스에 따라 모듈로 나눕니다. 각 모듈은 특정 업무 영역을 담당하며 독립성을 갖도록 설계합니다.
    - **모듈 간 인터페이스 정의:** 각 모듈 간의 상호 작용을 위한 인터페이스를 정의합니다. 이는 데이터 교환, 통신 프로토콜, API 정의 등을 포함하며, 모듈 간의 명확하고 안정적인 상호 작용을 보장합니다.
    - **의존성 관리:** 각 모듈의 의존성을 명시하고, 외부 라이브러리나 서비스에 대한 의존성을 관리합니다. 이는 모듈 간의 상호 의존성을 최소화하고 개별 모듈을 독립적으로 구축하고 테스트할 수 있도록 합니다.
    - **공통 모듈 및 라이브러리 활용:** 공통으로 사용될 수 있는 기능이나 라이브러리를 개발하여 각 모듈에서 활용합니다. 이는 코드 중복을 최소화하고 전체 프로젝트의 일관성을 유지하는 데 도움이 됩니다.

---

- **Hexagonal Architecture (포트와 어댑터 아키텍처) 구현**: Hexagonal Architecture를 활용하여 소프트웨어의 아키텍처를 설계했습니다. 이 아키텍처는 내부와 외부 요소 간의 분리를 강조하며, 주요 구성 요소는 다음과 같습니다:
    - **도메인 로직:** 핵심 비즈니스 로직을 담고 있는 도메인 모듈입니다. 이 모듈은 외부 시스템과 독립적으로 설계되며, 데이터베이스, 외부 API 등의 상세한 구현과 분리됩니다.
    - **포트 (Ports):** 외부에서 애플리케이션으로 데이터 및 요청을 주고 받는 인터페이스입니다. 이 포트들은 어댑터들과 상호작용하여 외부 시스템과 통신합니다.
    - **어댑터 (Adapters):** 포트를 실제로 구현하는 구성요소로, 외부 시스템과의 통신, 데이터베이스 액세스, 웹 요청 처리 등을 다룹니다.

---

- **QueryDSL를 활용한 데이터베이스 액세스**: QueryDSL을 사용하여 데이터베이스 액세스를 관리하고 도메인 객체와의 상호작용을 효과적으로 구현했습니다. 이를 통해 데이터베이스 쿼리를 Java 코드로 표현하고 타입 안정성을 확보하며, 데이터베이스 쿼리의 품질을 향상시켰습니다.

---

- **Domain Driven Development (DDD) 설계**: 도메인 주도 개발 방식을 채택하여 각 도메인을 모델링하고 개발했습니다.

---

- **Test Driven Development (TDD) 개발**: TDD를 수행하여 소프트웨어의 품질을 유지했습니다.

---

## 📝 프로젝트 구조

프로젝트 구조는 다음과 같습니다:

- **admin-application, api-application:** 필요한 모듈들만 의존하여 서비스를 구성하여 스프링 부트(Spring Boot) 애플리케이션을 시작하는 모듈입니다.
- **adapter-admin, adapter-api:** 어플리케이션과 어플리케이션 코어에 어뎁터 모듈입니다.
- **application-core :** 핵심 부분 중 하나로, 비즈니스 로직 및 응용 프로그램의 핵심 기능을 포함하는 순수 자바(pojo)로 구성된 모듈입니다.
- **adapter-persistence :** 데이터 영속성을 관리하고 데이터를 저장, 검색, 수정, 삭제하는 기능을 제공하고 데이터베이스와의 상호작용 및 데이터 영구적으로 보존하는 모듈입니다.

---

## 👨‍💻 **작성자 정보**

- 작성자: limJyeok
- 이메일 주소: kim5288403[@gmail.com](mailto:myusername@example.com)
- GitHub: https://github.com/kim5288403/multi-module
