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
                    *   |종류 |동작 |
                        |----|------|
                        |CASECADE| 연결된 객체가 지워지면 해당 하위 객체도 같이 삭제|
                        |PROTECT| 하위 객체가 남아 있다면 연결된 객체가 지워지지 않음|
                        |SET_NULL|연결된 객체만 삭제하고 필드 값을 null로 설정|
                        |SET_DEFAULT|연결된 객체만 삭제하고 필드 값을 설정된 기본 값으로 변경|
                        |SET()|연결된 객체만 삭제하고 지정한 값으로 변경|
                        |DO_NOTHING|아무일도 하지 않음|
                
