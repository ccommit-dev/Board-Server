# Board-Server
[패스트캠퍼스] 대용량 트래픽 게시판 프로젝트

---
# 목적
- 대용량 트래픽을 고려한 어플리케이션 개발 (초당 1000 tps 이상의 게시글 검색 API)
- 객체지향과 가독성을 고려한 코드 작성 방법 공유
- 현업 단계에서 코드리뷰를 어떻게 하는지 경험 공유 공유
- 모니터링 및 트러블 슈팅 전략 공유

---
# 사용기술
- JAVA 17, Spring Boot 2.3, MyBatis, MySQL, Redis

---
# 기획
- 커뮤니티 사이트의 게시판을 구현함으로써 자유롭게 소통하는 및 정보 공유 사이트를 목표로 구현
- ****https://ovenapp.io/view/Pv1HR7ajNN47W6qWgKHjIro334XPQvBj/****

---
# 프로그램 주요 기능
- 회원
  - 가입, 탈퇴
  - 아이디 및 닉네임 중복체크
  - 비밀번호 암호화
  - 로그인, 로그아웃
- 게시판
  - 카테고리 관리
    - 추가, 삭제, 수정
  - 게시글 관리
    - 게시글 & 파일 추가, 삭제, 수정, 조회
    - 유저 정보, 게시글 제목, 게시글 내용 등
  - 게시글 검색 기능
    - 작성 유정 아이디
    - 게시글 제목, 게시글 내용 등을 통해 검색
    - 태크 작성 및 조회 기능
  - 댓글 작성 기능
- 어드민
  - 공지글 추가 기능

---
# 이슈별 실습 내용
![이슈별 실습 내용 drawio](https://github.com/ccommit-dev/Board-Server/assets/77635521/9434ac9e-3e43-47f7-a2ad-6c560657e199)

---
# ERD(Entity Relationship Diagram)
![image](https://github.com/ccommit-dev/Board-Server/assets/77635521/7fb0ec6b-1317-4911-9315-067244a8dd9e)

---
# 시퀀스
- 게시글 등록 시퀀스
![패캠  게시글 등록 시퀀스](https://github.com/ccommit-dev/Board-Server/assets/77635521/7791db61-97cc-4ad8-a90c-2e0a572049c5)

- 게시글 검색 시퀀스
![게시글 검색 시퀀스](https://github.com/ccommit-dev/Board-Server/assets/77635521/c5f228fd-ca8f-4144-a407-30e2647f9159)

---
# 아키텍처(요약)
![게시판 서버 아키텍처 drawio](https://github.com/ccommit-dev/Board-Server/assets/77635521/62e053a4-51a4-4387-90c4-f5e450441f2f)

---
# 아키텍처(상세)
![sli0](https://github.com/ccommit-dev/Board-Server/assets/77635521/bc8eb387-ec9b-4a51-9c55-80332aa88547)


