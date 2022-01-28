r = range(4)

print(r) #range(0, 4)
print(list(r)) #[0,1,2,3]


for i in range(4): #0 ~ 3
    print('hello data', i)
    
    
# 0 ~ 3 까지 수 중 3의 배수 출력
for i in range(4):
    if i % 3 == 0:
        print(i);
        
i = 0
while i < 4:
    print('hello data',i)
    i = i + 1