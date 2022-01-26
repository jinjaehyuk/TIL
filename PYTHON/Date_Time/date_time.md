## 날짜 시간
* 날짜시간 생성
    * import 추가
    > ```import datetime```

    * now() 혹은 datetime() 함수 호출
    > ```datetime.datetime(년 ,월 ,일, 시, 분, 초, 마이크로초) #지정된 날짜시간 생성```
    ```py
        import datetime
        
        current_datetime = datetime.datetime.now() #현재 날짜시간 생성(2022-01-22 22:17:46.993637)
        
        print(current_datetime.year) # 2022
        print(current_datetime.weekday())  # 월 : 0 ~ 일 : 6
   
    ```
* 날짜시간 수정
    * replace() 함수 사용
    ```py
        import datetime

        current_datetime = datetiem.datetime.now()
        #2022-01-24 21:09:55.693865

        current_datetime = current_datetime.replace(year=2019)
        #2019-01-24 21:09:55.693865

        current_datetime = current_datetime.replace(year=2019, month=1, day=2, hour=3, minute=4, second=5, microsecond=678)
        print(current_datetime) #2019-01-02 03:04:05.000678
    ```

* 며칠 후 날짜시간 구하기
    * timedelta 더하기
    ```py
        import datetime
        
        ##days
        current_datetime = datetiem.datetime.now()
        #2022-01-24 21:09:55.693865

        new_datetime = current_datetime + datetime.timedelta(days=1) # 1일 #2022-01-25 21:18:21.890837

        new_datetime = current_datetime + datetime.timedelta(days=2) # 2일 #2022-01-26 21:18:21.890837

        new_datetime = current_datetime + datetime.timedelta(days=3) # 3일 #2022-01-27 21:18:21.890837
        
        ##weeks
        new_datetime = current_datetime + datetime.timedelta(weeks=1) # 1주 #2022-01-31 21:20:29.342089

        ##hours
        new_datetime = current_datetime + datetime.timedelta(hours=1) # 1시간 #2022-01-24 22:20:29.342089

        ##minutes
        new_datetime = current_datetime + datetime.timedelta(minute=1) # 1분 #2022-01-24 21:21:29.342089

        ##seconds
        new_datetime = current_datetime + datetime.timedelta(seconds=1) # 1초 #2022-01-24 21:20:30.342089

        ##milliseconds
        new_datetime = current_datetime + datetime.timedelta(secomillisecondsnds=1) #밀리초 천분의 1초 1/1000초 0.001초

        new_datetime = current_datetime + datetime.timldelta(hours=3, minutes=40) #세시간 40분 # 2022-01-25 01:06:37.407914
    ```
* 날짜시간 간격 구하기
    * 날짜시간끼리 빼기
    ```py
    import datetime

    current_datetime = datetime.datetime.now()

    timedelta = datetime.datetime(2030, 1, 1) - current_datetime
    print(type(timedelta)) #<class 'datetime.timedelta'>

    print('2030년 1월 1일 까지는 {}일 {}초 남았습니다'.format(timedelta.days, timedelta.secounds))# 2030년 1월 1일 까지는 2898일 8875초 남았습니다
    ```