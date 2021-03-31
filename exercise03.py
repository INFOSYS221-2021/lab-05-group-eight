# Exercise Three
# Write a simple program that finds the number of digits of a given integer value
value = -100
valStr = str(value)
if valStr.isdigit():
    print(len(valStr))
else:
    print(len(valStr)-1)

print("The number of digits for a value of 100 is 3")
