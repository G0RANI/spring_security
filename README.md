# spring_security



### Information

* springframework-version : 4.3.2

* security-version : 4.1.3

* MariaDB

* MyBatis

* BCrypt

### SpEL 문법

* hasRole('role1')
	* 권한(role1)을 가지고 있는 경우
* hasAnyRole('role1', 'role2')
	* 권한들(role1, role2) 하나라도 가지고 있을 경우 (갯수는 제한없다)
* pemitAll
	* 권한 있든 말든 모두 접근 가능하다.
* denyAll
	* 권한 있든 말든 모두 접근 불가능하다.
* isAnonymous()
	* Anonymous 사용자일 경우 (인증을 하지 않은 사용자)
* isRememberMe()
	* Remember-me 기능으로 로그인한 사용자일 경우
* isAuthenticated()
	* Anonymous 사용자가 아닐 경우 (인증을 한 사용자)
* isFullyAuthenticated()
	* Anonymous 사용자가 아니고 Remember-me 기능으로 로그인 하지 않은 사용자 일 경우

### form-login 설정
* username-parameter
	* input 태그의 아이디 혹은 이메일 name 속성 값 (default: username)
* password-parameter
	* input 태그의 비밀번호 name 속성 값 (default: password)
* login-page
	* 새로운 로그인 화면 url (default: 스프링 기본 로그인 화면)
* login-processing-url
	* form 태그의 action 속성 (default: POST /login)
* default-target-url
	* 로그인 성공시 호출할 url
* authentication-failure-url
	* 로그인 실패시 호출할 url (default: /login?error=1)
* authentication-success-handler-ref
	* 로그인 성공시 default-target-url이 아닌 핸들러로 리다이렉트
* authentication-failure-handler-ref
	* 로그인 실패시 authentication-failure-url이 아닌 핸들러로 리다이렉트
* always-use-default-target
	* 무조건 핸들러가 지정한 페이지로 이동 (default: false)
	
### logout 설정
* logout-url
	* 로그아웃 처리에 대한 URL. form태그의 action 속성에 지정한 값. (default: POST /logout)
* logout-success-url
	* 로그아웃 성공시, 이동할 URL. (default: /login?logout)
* invalidate-session
	* 로그아웃 시, session을 무효화할 지 선택. (default: true)
* delete-cookies
	* 로그아웃 성공시, 삭제할 쿠키 이름 지정
* success-handler-ref
	* 로그아웃 성공시, logout-success-url 이 아닌 핸들러로 리다이렉트

### 쿼리
CREATE TABLE 'user' (
'ID' varchar(100) NOT NULL,
'PASSWORD' varchar(300) NOT NULL,
'NAME' varchar(45) NOT NULL,
'AUTHORITY' varchar(50) NOT NULL DEFAULT 'ROLE_USER',
'ENABLED' tinyint(1) unsigned zerofill DEFAULT '1',
PRIMARY KEY ('ID')
) ENGINE=InnoDB DEFAULT CHARSET=utf8

INSERT user
VALUES ('user', '$2a$10$eSUXEwLVb7yIIgVeVAEkNezqiIKHGPfQjqyIdOKL9m4UC1YyvOBC6', '테스트', 'ROLE_USER', '1');

### 참고
https://to-dy.tistory.com/70?category=720806

https://songc92.tistory.com/46
