## 날짜 시간
* 날짜시간 생성
    * import 추가
     ```import datetime```

    * now() 혹은 datetime() 함수 호출
     ```datetime.datetime(년 ,월 ,일, 시, 분, 초, 마이크로초) #지정된 날짜시간 생성```
    ```
        import datetime
        
        current_datetime = datetime.datetime.now() #현재 날짜시간 생성(2022-01-22 22:17:46.993637)
        
        print(current_datetime.year) # 2022
        print(current_datetime.weekday)  # 월 : 0 ~ 일 : 6

        
    ```