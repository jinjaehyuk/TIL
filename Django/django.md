## Django
* 장고란?
    * WSGI 라는 미들웨어 방식
    * 적은 리소스로 높은 효율성을 냄
    * 가장 빠른 시간내에 웹 서비스를 구현할 수 있는 웹 프레임워크
    * 생산성이 좋다
        * 웹 서비스를 만들 때 필요한 대부분의 기능들을 미리 정형화된 형태로 준비해 두었다.
    * 데이터베이스와 통신을 위해 다양한 드라이버를 지원하고 ORM 방식을 통해 데이터베이스를 다룰 수 있다.
    * 다양한 기본 미들웨어를 사용해 웹 어플리케이션 보안성이 높다.

## 프로젝트 구조
<img src="django_structure.jpg"  width="300" height="200"> 

* 프로젝트 구조
    * config 폴더
        * 프로젝트 설정파일
        * 웹 서비스 실행을 위한 파일
            * __init__.py : 2.x 버전과의 호환을 위해 만들어졌다.
            * settings.py : 프로젝트 설정에 관한 다양한 내용들이 들어있다.
            * urls.py
                * 한 프로젝트 안에 여러개의 urls파일을 만드는 파일
                * config폴더 안에 있는 urls 파일이 최초로 탐색되는 기준 url 파일
                * wsgi.py : 웹서비스를 실행하기 위한 wsgi관련 내용이 들어있다.
    * venv 폴더 
         * 프로젝트 구동에 필요한 가상환경이 들어있는 폴더( 되도록 수정 삭제 X)
    * db.sqlite3 
        * SQLite3 DB파일 (임의 수정삭제 X)
    * manage.py
        * 장고의 다양한 명령어를 실행하기 위한 파일( 임의 변경 X)

## settings.py
* 프로젝트에 관한 다양한 설정이 모두 들어있다.
* 기본값들은 django/conf/global_settings.py 파일에 담겨있다.
* BASE_DIR
    * 루트 폴더를 찾아 그 하위 탐색하는 일 등을 빈번하게 수행하여 변수로 미리 준비해두는 값
* SECRET_KEY
    * 다양한 보안을 위해 사용
    * 세션값의 보호나 비밀번호 변경 시 사용되는 보안 URL을 만드는 일에 주로 사용
    * 임의로 변경할 수 있으나 변경하면 로그인이 풀리는 등의 부작용이 있음
    * 정해진 값은 외부에 노출되어서는 안됨
* DEBUG
    * 디버그 모드를 설정
    * True일 경우 다양한 오류 메시지를 즉시 확인할 수 있다.
    * 실제 배포시에는 False로 바꾸며, 이 때는 다른 설정값을 이용해 관리자가 오류 메시지를 받아보게 설정가능
* ALLOWED_HOST
    * 현재 서비스의 호스트를 설정
    * 개발시에는 비워두고 사용하나 배포시에 '*'나 실제 도메인을 기록
    * '*'는 위험하니 실제로는 도메인 기록 권장
    * DNS Rebinding을 막기 위한 조치
    * Debug모드가 false일 때 ALLOWED_HOST값이 비어있으면 서비스를 시작 할 수 없다.
* INSTALLED_APPS
    * 장고 웹 서비스는 다양한 앱의 결합으로 만들어짐
    * 현재 프로젝트에서 사용하는 앱의 목록을 기록하고 관리
* MIDDLEWARE
    * 장고의 모든 요청 / 응답 메시지 사이에 실행되는 특수한 프레임워크들
    * 주로 보안에 관한 내용들
* ROOT_URLCONF
    * 기준이 되는 urls.py 파일의 경로를 설정
* WSGI_APPLICATION
    * 장고에서 사용하는 템플릿 시스템에 관한 설정들
    * 템플릿 해석엔진과 템플릿 폴더의 경로 등을 변경하는데 쓰임
* DATABASES 
    * DB관련 설정
* AUTH_PASSWORD_BALIDATORS
    * 비밀번호 검증을 위한 설정
    * 기본적으로 사용자정보와 유사한지, 숫자로만 만들었는지, 너무 짧은지, 평범한 비밀번호인지 검증
* LANGUAGE_CODE등
    * 다국에 관한 설정들 

## wsgi.py
* wsgi 어플리케이션 구동을 위해 사용되는 파일
* 실제로는 웹 서버와 장고 애플리케이션 사이에 통신 역할을 담당
* WSGI ( Web Server Gateway Interface)
* 빠르게 동작하고 적은 리소스를 사용하도록 만들어짐
```
정보/콜백함수     해석
      =>       =>
웹서버      WSGI    장고 웹 어플리케이션
      <=        <=
    콜백함수 정보   파이썬 스크립트 처리 후 결과
```
## 기본 명령어
 |명령어 |설명 |
 |--------|--------------------------|
 |startapp| 프로젝트에 기능 단위인 앱을 새로 만들 때 사용|
 |makemigrations| 어플리케이션에 변경사항을 추적해 DB에 적용할 내용 정리 <br> 튜닝이 안된 쿼리나 슬로우 쿼리 여부를 확인 가능|
 |sqlmigrate| 실행할 SQL명령문을 출력 <br> 어떤 명령문인지 확인할 때 사용|
 |migrate| 실제 변경사항을 DB에 반영|
 |showmigrations|프로젝트 DB변경사항 목록과 상태를 출력|
 |runserver|테스트 서버 실행 <br> 웹 서비스를 실제 동작시켜 확인할 때 사용|
 |dumpdata|현재 DB의 내용을 백업할 때 사용|
 |loaddata|백업파일에서 DB내용을 복구할 때 사용|
 |flush|DB테이블은 그대로 두고 테이블 내용만 전부삭제|
 |shell|장고 쉘 실행 <br> 작성한 모델 등을 불러와 실제로 테스트할 수 있음|
 |dbshell|DB에 직접 접근할 수 있는 쉘을 실행 <br> SQL구문을 직접 수정하고 싶다면 dbshell이용|
 |createsuperuser|관리자 계정 생성|
 |changepassword|계정의 비밀번호 변경|

## MTV
* MTV
    * Model - Template - View
    * MVC / MTV
        * Model / Model - View/Template - Controller / View
        * 단어 뜻 보다는 같은 위치에 있는 것들 끼리 똑같은 역할을 수행

* models.py
    * DB의 명세를 관리
    * ORM (Object Relation Mapping)이라는 기능을 사용
* admin.py
    * 자신이 만든 모델을 관리자 페이지에서 확인하거나 특별한 기능을 추가하고 싶다면 해당 페이지에서 내용을 작성
* views.py
    * CRUD 페이지를 하나하나 만들때에는 views에 해준다
    * 클래스형 뷰
    * 함수형 뷰
* urls.py
    * views.py에 어떤 기능을 만들면 해당 기능을 동작시키는 방식은 url 호출이 주가 된다.
    * 어떤 url을 이용해 views를 동작시킬까 결정을 할 떄 urls.py에 기록
    * 프로젝트 urls.py와 각 앱에 해당하는 urls.py들로 구성
    * path 함수는 path(route, view, kwargs, name) 형태로 호출
        * route : 주소
        * view : route의 주소로 접근 했을 때 호출할 뷰
        * kwargs : 뷰에 전달할 값들
        * name 
            * route의 이름을 의미
            * 이 이름을 가지고 원하는 곳에서 주소를 호출해 출력하거나 사용할 수 있다.
* templates
    * 보통 HTML이 들어있는 파일
    * 확장자는 html이 대부분이지만 안에는 html이 아닌 템플릿 코드들도 들어있다.