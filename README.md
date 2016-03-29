# spring_bootstrap_mybatis_hibernate

mybatis와 hibernate 둘다 사용 가능한 spring base web project

=====data-access.properties 수정====================================

security.username.query=select userid username, '123' password,1 enabled from users where 1=1 and userid = ?

security.authorities.query=select 'piazz' username, 'ROLE_USER' authority from users where 1=1 and userid = ?

jdbc.driverClassName=oracle.jdbc.driver.OracleDriver

jdbc.url=jdbc:oracle:thin:@localhost:1521:CHEESE

jdbc.username=scott

jdbc.password=tiger
=======================================================================
 1. ID, USERID,EMAIL,PHONE 컬럼가진 USERS 테이블을 만들고 서버구동(USERID가 'piazz'인 데이터 입력)
 2. http://localhost:8080/Spring-Simple/    
 3. 로그인페이지에서 piazz/123으로 로그인
 4. 기본적인 CRUD 페이지 확인(mybatis/hibernate 둘다 사용가능)
 
