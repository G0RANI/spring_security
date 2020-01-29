spring_security
================

Version
-------------

springframework-version : 4.3.2

security-version : 4.1.3

SpEL 문법
-------------
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

