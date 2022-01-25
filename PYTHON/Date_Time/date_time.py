import datetime

current_datetime = datetime.datetime.now()

print(current_datetime)

print(current_datetime.year)

s = '{} {} {} {}:{}:{}'
print(
    s.format(current_datetime.year,
   current_datetime.month,
   current_datetime.day,
   current_datetime.hour,
   current_datetime.minute,
   current_datetime.second)
)

print(current_datetime.strftime('%x'))
print(current_datetime.strftime('%X'))
print(current_datetime.strftime('%j'))
print(current_datetime.strftime('%Y-%m-%d %H:%M:%S'))

current_datetime = current_datetime.replace(year=2019)
print(current_datetime)

current_datetime = current_datetime.replace(year=2019, month=1, day=2, hour=3, minute=4, second=5, microsecond=678)
print(current_datetime)

current_datetime = datetime.datetime.now()
new_datetime = current_datetime + datetime.timedelta(days=1)

new_datetime = current_datetime + datetime.timedelta(weeks=1)

new_datetime = current_datetime + datetime.timedelta(hours=1)

new_datetime = current_datetime + datetime.timedelta(milliseconds=1)



new_datetime = current_datetime + datetime.timedelta(hours=3, minutes=40)
        
        
timedelta = datetime.datetime(2030, 1, 1) - current_datetime
print(type(timedelta))

print('2030년 1월 1일 까지는 {}일 {}초 남았습니다'.format(timedelta.days, timedelta.seconds))
print(new_datetime) 



##연습문제
print('===========연습문제============')
current_datetime = datetime.datetime.now()
print(current_datetime.year)
print(current_datetime.month)
print(current_datetime.day)

print('=========================')

future_datetime = datetime.datetime(2030, 12, 12)
days_of_week = ['월','화','수','목','금','토','일']

print(days_of_week[future_datetime.weekday()])
print('=========================')

current_datetime = current_datetime.replace(year=2019)
print(current_datetime.year)
print(current_datetime.month)
print(current_datetime.day)
print('=========================')

print(current_datetime.strftime('%Y-%m-%d'))

print('=========================')
s = '2022-01-24'
current_datetime = datetime.datetime.strptime(s, '%Y-%m-%d')
print(current_datetime.year)
print(current_datetime.month)
print(current_datetime.day)