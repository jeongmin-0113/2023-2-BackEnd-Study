# This Week What I Learned - Week 2
======

##### HTTP (HyperText Transfer Protocol)
: 서로 다른 시스템들의 통신을 가능케하는 application 계층의 프로토콜
- 웹에서만 사용하는 프로토콜
- TCP/IP 기반, 서버와 클라이언트 간 request와 response를 전송

**특징**
1. Transfer layer: TCP/IP 기반으로 서버와 클라이언트간 요청과 응답을 전송
2. 비연결성(connectionless): 클라이언트-서버가 연결을 맺은 후 클라이언트 요청-서버 응답 마치면 연결을 끊어버림.
--> 서버는 클라이언트, 클라이언트가 보낸 이전 요청에 대한 어떤 데이터도 유지하지 않음
3. 무상태성(stateless): 비연결성으로 인해 서버는 클라이언트와 연결에 대한 정보를 저장하지 않음. 따라서 서버는 클라이언트를 식별하지 못함

**HTTP Message**
: HTTP가 데이터를 주고 받는 매개체
- 종류: request, response
- 구조: http method, 경로, http 버전, 헤더

**HTTP Method**
: request message의 목적, 종류를 알림
- GET: 리소스 조회
- POST: 요청 데이터 처리(등록)
- PUT: 리소스를 대체, 없다면 생성
- PATCH: 리소스 부분 변경
- DELETE: 리소스 삭제
- HEAD: GET과 기능 동일. 상태 줄과 헤더만 반환
- OPTIONS: 대상 리소스레 대한 통신 가능 옵션(메서드)를 설명
- CONNECT: 대상 리소스로 인식되는 서버에 대한 터널을 설정
- TRACE: 대상 리소스에 대한 경로를 따라 메시지 루프백 테스트 수행

##### HTTPS
: HTTP + 암호화 프로토콜
- 웹 서버와 클라이언트 간 안전한 통신을 가능케 함

##### HTTPS vs HTTP
- HTTP: HTTP를 통한 통신의 패킷은 일반 텍스트로 이루어짐
--> 안전하지 않은 매체 사용시 도청에 매우 취약
- HTTPS: 트래픽이 암호화됨.
--> 패킷을 가로채더라도 암호화된 텍스트를 이해할 방법이 없음.
--> 따라서 안전하다! 

##### REST
: 자원을 이름으로 구분하여 해당 자원의 상태를 주고 받음.
- REST의 원칙을 지킨 서비스 디자인은 RESTful하다고 표현

**REST 원칙**
1. 인터페이스 일관성: 플랫폼, 언어에 종속되지 않고 사용 가능한 인터페이스 스타일
2. 무상태성: 컨텍스트 저장소에 상태 정보 저장하지 않음. 서버는 요청에 대한 응답만!
3. Resource 지향 아키텍쳐(ROA): 리소스 기반 복수형 명사 형태의 정의를 권장
4. 클라이언트-서버 아키텍쳐
5. 캐시 기능: HTTP 프로토콜에서 사용하는 태그 활용, 캐싱처리
6. 계층화: 다중계층 구성 가능. 계층 추가로 구조상의 유연성 획득. 네트워크 기반 중간매체도 활용 가능
7. 자체 표현 구조: REST API 메시지만 보고 쉽게 이해 가능한 구조

##### RESTful URL 설계

- 이벤트 목록 조회: /events/list
- 이벤트 조회: /events/{eventId}
- 이벤트 등록: /events/register
- 이벤트 수정: /events/{eventId}/modify/data
- 이벤트 삭제: /events/{eventId}/delete
- 이벤트 상태 변경: /events/{eventId}/modify/state
- 특정 이벤트의 주문 목록 조회: /events/{eventId}/order/list

- 멤버 목록 조회: /members/list
- 특정 멤버 권한 변경: /members/{userId}/modify/state
- 특정 멤버 정보 조회: /members/{userId}
- 특정 멤버 정보 변경: /members/{userId}/modify/data
- 멤버 등록: /members/register