## 반복문
* 반복문
    * for 문 : 범위로 반복
    * while 문 : 조건식으로 반복

* 범위
    * 0 부터 시작하는 연속적인 정수들의 모음
    * range(생성할 연속적인 정수의 개수)
    ```py
    r = range(4)

    print(r) #range(0, 4)
    print(list(r)) #[0,1,2,3]
    ```

* for 문
    * 범위로 하위 블럭 (실행문) 반복 실행
    * 공백으로 들여쓰기에 의한 하위 블럭 구분
    * 형식
    ```py
    for 변수 in range(생성할 연속적인 정수의 개수): #횟수
        실행문 
    ```
    ```py
    for i in range(4): #0 ~ 3
        print('hello data', i)
    #hello data 0
    #hello data 1
    #hello data 2
    #hello data 3   
    ```

* while 문
    * 형식
    ```py
    변수초기화 
    while 조건식:
        실행문
        변수더하기
    ```
    ```py
    i = 0
    while i < 4:
        print('hello data',i)
        i = i + 1
    ```

* 무한 반복문
    * 조건식에 True 사용
    * 무한 반복이기 때문에 변수가 범위 내에 없으면 빠져 나오기 (break)
    ```py
    i = 0
    while True:
        if i >= 4:
            break
        print('hello data')
        i = i + 1
    ```

* 중첩 반복문
    * 반복문 밑에 하위 반복문 사용
    ```py
    for i in range(4):
        print ('i:', i)
        for j in range(4):
            print('j:', j)
    ```