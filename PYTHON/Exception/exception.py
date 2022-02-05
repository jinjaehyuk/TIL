c = 3

try:    
    c = c / 0 
except ZeroDivisionError as e: #발생한 예외를 처리
    c = 0

print(c) 
