# Exercise Two
# Write a simple program that finds the value at the nth position in the Fibonacci sequence
n1 = 0
n2 = 1
count = 1
nterms = 6
nth = 0
while count < nterms:
    nth = n1 + n2
    n1 = n2
    n2 = nth
    count += 1
print(nth)
print("The value at the 6th postion in the Fibonacci sequence is 8")
