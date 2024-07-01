str1 = "prasun Patidar !!!!!!!!!!!!"

#Strings are imutable in python .
# we can change but not on same place of memory
# result = str1.upper()
# print(result)
# print(result.lower())
# print(str1 , ':')
print(str1.rsplit('!'))
print(str1.replace("prasun","Sun"))
print(str1.split(" "))
print(str1.capitalize())
print(str1.center(100))