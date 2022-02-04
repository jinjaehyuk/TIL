## 람다 함수
* 람다 함수
    * 간략한 버전의 함수
    * def 대신 lambda를 사용하고 이름을 사용하지 않고 선언과 동시에 사용
    ```py
    (lambda: print('hello data')))() #hello data
    ```

* 매개변수
    * 괄호를 사용하지 않음
    ```py
    (lambda to: print('hello', to))('data') # hello data
    ```

* 디폴트 매개 변수
    * 디폴트 매개 변수를 가질 수 없음
    
* 값 리턴
    * return 키워드를 사용하지 않고 바로 되돌려 주는 결과 값을 적어 줌
    ```py
    minus = lambda a, b: a - b
    i = minus(3, 2)
    ```

* 람다 함수를 매개 변수로 가지는 함수
    * map, filter, sort, sorted 함수가 존재

    * map
        * 람다 함수로 컬렉션 생성 = 컬렉션 축약 
    ```py
    l = list(map(lambda i: i * i, range(4)))
    ```
    * filter
        * 람다 함수로 컬렉션 필터링 = 컬렉션 축약시 조건식 사용
    ```py
    l = list(filter(lambda i: i % 2 == 0, range(4)))
    ```
    
