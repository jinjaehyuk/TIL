persons = [
    {'korean': 100, 'english': 90, 'math': 85},
    {'korean': 70, 'english': 80, 'math': 90},
    {'korean': 80, 'english': 85, 'math': 70}
]
for person in persons:
    print(person['korean'], person['english'], person['math'])
    
print('============')

from collections import defaultdict
s = 'python big data crawling analysis visualization machine learning deep learning'

d_frequency = defaultdict(lambda:0)
words = s.split()
for word in words:
    d_frequency[word] = d_frequency[word] +1
for word, frequency in d_frequency.items():
    print(word, frequency) 

print('============')
import random
l = [random.random() for i in range(10)]
print(l)

print('============')

s = 'python big data crawling analysis visualization machine learning deep learning'
words = s.split()
l = [word for word in words if len(word) <= 4] 
print(l)

print('============')

l = []
if l:
    print('A')
else:
    print('B')
    
print('============')

import random
s = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
l = random.sample(s, 4)
print(''.join(l))

print('============')
morse = '-.. .- - .-'

morse_dic = {'.-': 'A', '-...': 'B', '-.-.': 'C', '-..': 'D', '.': 'E', '..-.': 'F',
    '--.': 'G', '....': 'H', '..': 'I', '.---': 'J', '-.-': 'K', '.-..': 'L',
    '--': 'M', '-.': 'N', '---': 'O', '.--.': 'P', '--.-': 'Q', '.-.': 'R',
    '...': 'S', '-': 'T', '..-': 'U', '...-': 'V', '.--': 'W', '-..-': 'X',
    '-.--': 'Y', '--..': 'Z'}
sentence = []
for char in morse.split():
    sentence.append(morse_dic[char])
    
print(''.join(sentence))
print('============')

from collections import defaultdict
d = defaultdict(int)
for number in range(1,101):
    for c in str(number):
        d[c] = d[c] + 1
for k, v in d.items():
    print(k,v)
        