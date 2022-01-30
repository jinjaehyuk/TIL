l = ['d','a','t','a','z']
s = [1,2,3,4]
print(min(l))
print(max(l))
print(sum(s))

feature = ['hour','attendance']
importance = [1, 0]
        
features_importances = zip(feature, importance)
#features_importances = [('hour', 1), ('attendance', 0)]

for feature, importance in features_importances:
    print(feature, importance)