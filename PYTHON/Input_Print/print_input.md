## 화면출력
* print(문자열) 
    * 화면에 문자열을 출력
    ```py
    print('hello data')
    
    #끝에 줄바꿈('\n') 추가 
    print('hello data', end ='\n')

    print('hello data', end ='') # 끝 줄바꿈을 ''로변경
    ```
* print(문자열, 문자열)
    * 여러문자열을 출력
    ```py
     print('hello','data')
     #hello data 사이에 공백을 사용
     print('hello','data',sep=' ')

     #hello data 사이에 ,를 사용
     print('hello','data',sep=',')
    ```

## 키보드입력
* input()
    * 키보드로부터 줄 바꿈 전 까지의 데이터를 문자열 타입으로 입력받는다.
    ```py
        name = input() # jin
        print('hello', name) #hello jin
    ```
* input('안내문구 :')
    * 안내문구 출력 후 데이터를 입력받고자 하는 경우
    ```py
        name = input('이름을 입력해주세요: ')
        # 이름을 입력해주세요 : 

    ```
## 이스케이프 문자
* 이스케이프 문자
    * | (백슬래시) 와 바로 뒤에 같이오는 특정문자 (r, n ,t 등)를 하나로 합쳐 하나의 이스케이프 문자라고 하고 출력시 특별한 의미를 나타냄

    * \n
        * 줄바꿈

    * 캐리지 리턴(Carriage Return) 
        * 종이 오른쪽으로 밀기
    * 라인 피드 (Line Feed)
        * 종이 위로 밀기
        ```py
        print('hello data\r\data hello')
        # \r\n : 캐리지 리턴 + 라인피드, 윈도우즈 운영 체제에서의 줄바꿈
        #\n : 라인피드, 유닉스 (맥) 운영체제에서의 줄바꿈
        # hello data
          data hello
         ```
    * \t
        * 탭
        ```py
        print('hello\tdata') # hello    data
        ```
    * \'
        * ' (홑따옴표)
        ```py
            print('I\'m')#I'm
            print("I'm")#I'm
            print('I'm')#SyntaxError
        ```
    * \"
        * "(쌍따옴표)
    * \\
        * \ (백슬래시) 자체를표시
    
    
