## 문자열을 날짜시간으로 변환
* 문자열을 날짜시간으로 변환
    * strptime() 함수 
    
```
    import datetime

    s = '2022-01-23 01:02:03'
    current_datetime = datetime.datetime.srtptime(s, '%Y-%m-%d %H:%M:%S')

    print(current_datetime) #2022-01-23 01:02:03

```
