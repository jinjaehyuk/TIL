* 날짜시간 문자열 포매팅
    * {} 포맷코드 대신 %알파벳 포맷코드 사용
    * 날짜시간을 문자열로 변환
    ```
    import datetime

    current_datetime = datetime.datetime.now() #현재 날짜시간 생성(2022-01-22 22:17:46.993637)

    s = '{} {} {} {}:{}:{}'
    print(
     s.format(current_datetime.year,
              current_datetime.month,
              current_datetime.day,
              current_datetime.hour,
              current_datetime.minute,
              current_datetime.second)
    ) # 2022 1 22 22:17:46

    ```
    * strftime() 함수
        * 한 개 또는 복수의 format code를 argument로 취해서 그것에 기초한 formatted string을 리턴
     |지정자|의미|
     |----|---------------------------------|
     |%Y | 년도 4자리 표기 ex) 2022             |
     |%y | 년도 2자리 표기 ex) 22               |
     |%m | 월 2자리 표기 ex) 01                 |
     |%b | 월 영어로 앞 세자리 표기 ex) Jan        |
     |%B | 월 영어로  표기 ex) January           |
     |%d | 일 2자리로 표기 ex) 23                |
     |%a | 요일 영어로 앞 세자리 표기 ex) SUN       |
     |%A | 요일 영어로 표기 ex) Sunday            |
     |%w | 요일 숫자로 표기 ex) 일 : 0 ~ 토 : 6    |
     |%H | 시간 표기 ex) 01 #시                  |
     |%M | 분 표기 ex) 09 #분                    |
     |%S | 초 표기 ex) 09 #초                    |
     |%f | 마이크로초, 백만분의 1초 표기 ex) 1/1000000 초 > 0.000001초     |
     |%p | AM, PM표기                            |
     |%x | m-d-y 로 표기 ex) 01/23/22 #월-일-년도   |
     |%X | H:M:S 로 표기 ex) 01:14:06 #시:분:초    |
     |%j | 1월 1일부터 누적된 날짜 (1 ~ 365) ex) 023 |

    > ```print(current_datetime.strftime('%Y-%m-%d %H:%M:%S')) #2022-01-23 01:20:25```
