## Django_example
* [실전프로젝트 - Dstargram](https://github.com/jinjaehyuk/django_example)
    * 인*그램 카피 예제, 모든 기능을 구현하진 않지만 구현할 수 있는 내에서 비슷하게 구현을 해보면서 이미지 파일에 관한 설정, 서버셋팅, 파일 다루기를 중점적으로 진행

    * 기능
        * 부트스트랩 사용
        * 상단 메뉴바
            * 홈 링크
            * 환영 메시지
            * 업로드 링크
            * 로그인(로그아웃), 회원가입
        * 메인 페이지는 사진 몰록을 출력 및 댓글 시스템 사용
    * [Photo 앱 만들기](https://github.com/jinjaehyuk/django_example/blob/main/photo/models.py)
        * ``` python3 manage.py startapp photo```
        * 모델 만들기
            * 모델은 항상 클래스 형태로 만들고 models.Model을 상속받는다.
            * Photo 모델은 총 5개의 필드를 만든다.
                * author
                    * ForeignKey를 사용하여 User테이블과 관게를 만듬
                    * on_delete 인수는 연결된 모델이 삭제 될 경우 현재 모델의 값을 어떻게 사용할 것이냐 이다. 삭제 될 때에 동작은 다음곽 같은 옵션 선택가능
                       |종류 |동작 |
                        |----|------|
                        |CASECADE| 연결된 객체가 지워지면 해당 하위 객체도 같이 삭제|
                        |PROTECT| 하위 객체가 남아 있다면 연결된 객체가 지워지지 않음|
                        |SET_NULL|연결된 객체만 삭제하고 필드 값을 null로 설정|
                        |SET_DEFAULT|연결된 객체만 삭제하고 필드 값을 설정된 기본 값으로 변경|
                        |SET()|연결된 객체만 삭제하고 지정한 값으로 변경|
                        |DO_NOTHING|아무일도 하지 않음|
                    * 세번쨰 인수인 related_name 은 연결된 하위 객체의 목록을 부를 때 사용할 이름
                * photo 
                    * 사진 필드
                    * upload_to는 사진이 업로드 될 경로를 설정
                    * 만약 업로드가 되지 않았을 경우 default 값으로 대체
                * text 
                    * 사진에 대한 설명을 저장할 텍스트 필드
                    * 문자열 길이에 제한이 없다
                * create
                    * 글 작성일을 저장하기 위한 날짜시간 필드
                    * add_now_add 옵션을 설정하면 객체가 추가될 떄 자동으로 값을 설정
                * upload
                    * 글 수정 일을 저장하기 위한 날짜시간 필드
                    * auto_now 옵션을 설정하면 객체가 수정될 떄마다 자동으로 값을 설정
            * Meta 클래스
                * ordering 클래스 변수는 해당 모델의 객체들을 어떤 기준으로 정렬할 것인지 설정
                * -updated로 설정하여 글 수정 시간의 내림차순으로 정렬
            
            * __str__ 메서드 추가
                * __str__메서드는 작성자의 이름과 글 작성일을 합친 문자열을 반환
            
            * get_absolute_url 매서드 추가
                * 객체의 상세 페이지의 주소를 반환하는 메서드
                * 객체를 추가 및 수정했을 때 이동할 주소를 위해 호출되기도 하고 템플릿에서 상세 화며으로 이동하는 링크를 만들 떄 호출
                * reserve 메서드 사용
                    * URL 패턴 이름을 가지고 해당 패턴을 찾아 주소를 만들어주는 함수
                
            * 모델 완성 후 데이터베이스 적용
                * ```python3 manager.py makemigrations photo```
                * makemigrations를 이용해 기록한 변경사항을 데이터베이스에 적용하려면 migrate 명령 사용<br>
                ```python3 manage.py migrate photo 0001```

        * 관리자 페이지에 모델 등록
            * admin.py 파일을 수정하여 Photo 모델을 등록
            
        * 관리자 페이지 커스터마이징
            |옵션| 설명|
            |---|---|
            |list_display|* 목록에 보일 필드 설정 <br> * 모델의 필드를 선택하거나 별도 함수를 만들어 필드처럼 등록가능 |