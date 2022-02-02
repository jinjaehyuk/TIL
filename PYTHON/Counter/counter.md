## 카운터
* 카운터
    * 리스트내 값의 빈도수를 계산해 그 값을 키로 빈도수를 값으로 가지는 새로운 사전 생성
    ```py
    import collections

    frequency_d = collections.Counter(['d','a','t','a'])

    print(frequenty_d) #Counter({'a':2, 'd':1, 't':1})
    ```
* 키
    * 사전의 키 기능 모두 지원
    ```py
    import collection
    frequency_d = collections.Counter(['d','a','t','a'])

    print(frequency_d['d']) # 1
    ```
* 탐색
    * 사전의 탐색 기능 모두 지원
    ```py
    import collections

    frequency_d = collections.Counter(['d', 'a', 't', 'a'])

    print(frequency_d.items()) #dict_items([('d', 1), ('a', 2), ('t', 1)]) #키와 값 리스트

    for k, v in frequency_d.items(): #키와 값 순회
    print(k, v)
    '''
    d 1
    a 2
    t 1
    ''' 
    ```
    * 추가적으로 most_common() 함수지원
        * 빈도수 순 모든 키와 값(빈도수) 리스트
    ```py
    import collections

    frequency_d = collections.Counter(['d','a','t','a'])
    print(frequency_d.most_common())  #[('a', 2), ('d', 1), ('t', 1)]
    print(frequency_d.most_common(2)) #[('a', 2), ('d', 1)] #상위 2개
    for k, v in frequency_d.most_common(2): #키와 값 순회, 상위 2개
    print(k, v)
    '''
    a 2
    d 1
    ''' 
    ```