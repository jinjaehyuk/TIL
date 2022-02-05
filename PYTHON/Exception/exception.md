## 예외
* 에러
    * 프로그램에서는 하드웨어적인 에러는 처리 할 수 없으며 소프트웨어적인 에러만 처리 가능합니다
    * 하드웨어적인 에러
    * 소프트웨어적인 에러
        * 문법 에러와 실행 도중 발생하는 에러로 나눌 수 있습니다.
        * 문법에러
            * 코드의 문법이 틀려서 나오는 에러
        * 예외
            * 실행 도중 발생하는 에러를 예외라고 부릅니다.
            * 예외 발생시 예외가 발생한 지점에서 프로그램이 종료되어 그 이후 코드는 실행되지 않는다.

* 예외 처리
    * 예외 발생 시 발생한 예외를 except 문에서 처리하면 프로그램이 종료되지 않고 그 이후 코드가 계속 실행 됩니다.
    ```py
    c = 3
    try:
        c = c / 0
    except: # 발생한 예외를 처리
    #except ZeroDivisionError:
    #except ZeroDivisionError as e:
    
        c = 0
    
    print(c) # 0

    ```
* 여러 종류의 예외처리
    * 예외들이 상속관계일 경우 상위 예외의 ecept문은 아래에 배치해서 위에서 처리되지 못한 예외를 밑에서 처리되게 하는 것을 권장
    ```py
     c = 3

    try:
        c = c / 0
    except ZeroDivisionError:
        c = 0
    except ArithmeticError:
        c = 0    
    except Exception: 
        c = 0    
    except BaseException: #BaseException은 가장 상위 예외로 이 예외의 except 문은 어떠한 예외도 처리 가능
    #except: 
        c = 0

    print(c) 
    
    ```
    * 참고) ZeroDivisionError 예외의 상위 예외
    ```
    BaseException
    +-- Exception
      +-- ArithmeticError
      |    +-- ZeroDivisionError
    ```

* else 문과 finally 문
    * except 문 밑에 els 문 혹은 finally 문을 사용할 수 있습니다.
    * else 문은 예외가 발생하지 않을 경우 실행된다.
    * finally 문은 예외 발생과 관계 없이 반드시 실행된다.
    ```py
    c = 3

    try:    
        c = c / 0 
    except ZeroDivisionError:
        c = 0 #
    else: 
        print('else')    
    finally: 
        print('finally') #
    
    print(c) #   

    ```