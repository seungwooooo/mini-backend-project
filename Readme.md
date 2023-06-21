## File - New - Java Project 생성

## Maven프로젝트로 변경
- 프로젝트 우클릭 - Configure - Convert to MavenProject

## pom.xml 설정
- Packaging : war로 설정 ( 스프링은 톰캣위에 war를 얹어서 구동할것이고
추후 스프링부트로 변경시 부트는 내장톰캣이 있으므로 jar로 변경하여 작업할
예정)
Jar : 동작에 톰캣이 필요없는 Application, bin내에 있는 .class파일을 패키지로 묶은 것
War : 톰캣 위에서 동작하는 Application으로 webapp폴더 아래에 있는 파일들이 war로 묶여진다.
- pom.xml의 groupId, artifactId, version 설정
groupId : 모든 프로젝트 사이에서 고유하게 식별하게 해준다,
패키지 명명 규칙이나 도메인을 거꾸로하여 설정한다.
artifactId : 버전 정보를 생략한 jar파일의 이름이다.
- 디펜던시 작성 //디펜던시 역할들 주석으로 작성
- version - 1.0.0.0 고정 (서비스들은 nexus 배포 대상이 아니기 때문에 버전을 고정 합니다)

## web.xml 설정
- web.xml 추가 (Java EE Tools > Generate Deployment Descriptor Stub)
 -> WEB-INF/web.xml 파일 생성확인완료
   1) /WEB-INF/applicationContext.xml (Root Application Context)
   2) /WEB-INF/spring-servlet.xml     (Web Application Context)
2가지 파일 생성후 web.xml에 설정
( https://ekfqkqhd.tistory.com/entry/Spring-%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4%EC%97%90%EC%84%9C-ApplicationContextxml-%ED%8C%8C%EC%9D%BC-%EB%A7%8C%EB%93%A4%EA%B8%B0)
-> 이클립스에서 applicationContext 생성방법

## package 생성
   com.talk.controller
   com.talk.service
   com.talk.repository
   com.talk.vo

## views/*.jsp 파일 정리

## JWT를 통해 로그인 인증 제작
-> 해당 내용 노션에 정리
controller를 어떻게 사용할지에 대해 고민해보기