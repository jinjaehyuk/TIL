## 산술 연산자
* 산술 연산자
    * 양쪽 숫자를 계산, 결과값은 숫자
    ```+, -, *, /, **, //, % ```
    ``` py
    print(3 + 2)  #덧샘
    print(3 - 2)  #뺄샘
    print(3 * 2)  #곱셈
    print(3 / 2)  #나눗셈
    print(3 ** 2) #9 3^2#제곱 / 같은수를 여러번 곱하기
    print(3 // 2) #1 #버림 나눗셈 ( 나눈 몫), 결과는 정수
    print(3 % 2)  #1 #나눈 나머지
    ```
* 산술의 연산자의 우선순위
    * 곱셈과 나눗셈이 덧셈과 뺄셈보다 우선순위가 높음
```py
print(3 + 2 * 2) #7
print((3 + 2) * 2) #10
```

## 대입 연산자
* 대입 연산자
    * 오른쪽 값을 왼쪽 변수에 대입
    * = (단순 대입)
    ```py
        i = 3
        print(i)#3
    ```
    * ``` +=, -=, *=, /=, **=, //=, %= (계산 후 대입, 자기자신과 오른쪽 숫자를 계산 후 자기 자신에 대입)```
    ```py
    i = 3
    i += 2 #i = i + 2
    print(i)   #5

    i = 3
    i -= 2 # i = i - 2
    i *= 2 # i = i * 2
    i /= 2 # i = i / 2
    i **= 2 # i = i ** 2
    i //= 2 # i = i // 2
    i %= 2 # i = i % 2
    ```
    
## 비교 연산자
* 비교연산자
    * 양쪽 값을 비교, 결과값은 True 혹은 False
    ```py
        ==, !=, >, <, >=, <=
    ```
    ```py
    #동등 비교
    print(3 == 2) # False #값이 같으면 True
    print(3 != 2) # True #값이 다르면 False
    #대소 비교
    print(3 > 2) #Ture 
    print(3 < 2) #False
    #대소 비교와 동등 비교를 동시에
    print(3 >= 2) #True #값이 크거나 같으면 True
    print(3 <= 2) #False #값이 작거나 같으면 True
    ```

## 논리연산자
* 논리연산자
    * 논리값 (True 혹은 False)을 연산해 새로운 논리값 도출
    ```
    논리값 and 논리값 : 양쪽 모두 참이면 참
    논리값 or 논리값 : 둘 중 어느 한쪽만 참이여도 참
    not 논리값 : True 면 False, False or True
    and, or, not
    (&&, ||, !가 아님)
    ```
    ```py
    print(False and True) #False
    print(False or True) #True
    print(not False) #True

    print((3==2) and (3 != 2)) #False
    print((3==2) or (3 != 2)) #True
    print(not (3 != 2)) #True
    ```

