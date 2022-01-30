## 컬렉션 데이터 타입
* 컬렉션 데이터 타입
    * 하나의 값이 아닌 값들의 모음

## 리스트
* 리스트
    * 순서있는 값들의 모음
    * 값 추가시 인덱스(순서를 나타내는 번호표)가 0부터 자동 생성
    * 리스트 생성
        * 대괄호[] 사용시 자동생성
        ```py
        l = ['d','a','t','a']
        print(l) #['d','a','t','a']
        print(type(l))#<class 'list'>
        print(len(l)) # 4
        ```
    * 참고) 리스트의 모든 데이터 타입의 데이트럴 값으로 가질 수 있음

* 인덱싱 
    * 인덱스(순서를 나타내는 번호표)로 한개의 값 가져오기
    * 형식
    ```py
    변수명[인덱스]
    ```
    * 인덱스는 갑스이 위치를 나타내는 정수
    * 범위를 넘으면 예외(IndexError) 발생

* 슬라이싱
    * 인덱스의 범위로 여러개의 값 가져오기
    * [시작 인덱스 : 끝 비포함 인덱스]
    * [ 시작 인덱스 : 끝 비포함 인덱스 : 인덱스 증가치]

* 탐색
    ```py
    l = ['d','a','t','a']
    ```
    * 특정 값의 인덱스
    ```py
    print(l.index('d')) #0
    print(l.index('x')) # 값이 없으면 예외 발생    
    ```
    * 특정 값의 존재 (포함) 체크
    ```py
    print('d' in l)#True
    print('x' in l)#False
    print('x' not in l)#True
    ```
    * 특정 값의 개수
    ```py
    print(l.count('d'))#1
    ```
    * 최대값, 최소값, 합
    ```py
    print(min(l)) #a
    print(max(l)) #t
    s = [1,2,3,4]
    print(sum(s))#10
    print(sum(l))#예외발생 TypeError
    ```
    * 값 정렬
        * sort() : 오름차순 정렬
        * sort(reverse=True) : 내림차순 정렬
        * 변수명 = sorted(변수명) 
            * 오름차순 정렬
            * 변수명에 결과를 할당해 변수명을 변화시키기
            * 주로 튜플의 정렬에 사용
        * 변수명 = sorted(변수명, reverse=True)
            * 내림차순 정렬
    
    * 값 순회
        * for문 사용
    
    * 값과 함께 인덱스도 가져오기
        * enumerate()함수 사용
        ```py
        for i,v in enumerate(l):
            print(i, v)
        # 0 d
        # 1 a
        # 2 t
        # 3 a
        ```
    
    * 여러개의 리스트에서 병렬로 가져오기
        * 여러개의 리스트에서 앞에서 부터 같은 위치의 값을 가져오기
        * zip() 함수 사용
        ```py
        feature = ['hour','attendance']
        importance = [1, 0]
        
        features_importances = zip(feature, importance)
        #features_importances = [('hour', 1), ('attendance', 0)]

        for feature, importance in features_importances:
            print(feature, importance)

        #hour 1
        #attendance 0
        ```
    * 추가 수정 삭제
## 튜플

## 범위

## 집합

## 사전
