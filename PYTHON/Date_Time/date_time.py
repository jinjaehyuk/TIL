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