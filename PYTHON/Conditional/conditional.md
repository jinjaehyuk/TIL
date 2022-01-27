## 조건문
* if문
    * 조건식이 만족(True)하면 하위 블럭 실행
    * 공백으로 들여쓰기에 의한 하위 블럭구분
    * 하위 블럭 내 실행문이 여러개 오면 모두 같은 수의 공백을 사용해야 함
    * 형식
    ```py
    if 조건식:
        실행문
    ```
    ```py
    if 3 > 2:
        print('3 > 2') #3 >2
    #조건식에 주로 변수 사용
    i = 3
    if i > 2:
        print('if문 탔음')
    ```

* if-else 문
    * 두 가지 실행 경로가 있을 경우 사용
    * 형식
    ```py
    if 조건식:
        실행문
    else:
        실행문
    ```
    ```py
    i = 3
    if i > 2:
        print('if문')
    else:
        print('else문')
    ```

* if-elif-else 문
    * 세가지 이상 실행 경로가 있을 경우 사용
    * 형식
    ```py
    if 조건식:
        실행문
    elif 조건식:
        실행문
    else:
        실행문
    ```
    ```py
    i = 3
    if i > 2:
        print('i > 2')
    elif i > -2:
        print('i > -2')
    else:
        print('else')
    ```

* 조건식에서 기본 데이터타입 사용
    * 내용물이 있으면 True, 내용물이 없으면 False
    ```py
    if None: #내용물이 없음
        print('None')

   if 'data': #내용물이 있음
       print('data') #data
    if ' ': #내용물이 있음
      print('스페이스') #스페이스
    if '': #내용물이 없음
      print('빈 문자열')
    ```