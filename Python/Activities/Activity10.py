x=input("Please enter 1st number :");
x1=input("Please enter 2nd number :");
x2=input("Please enter 3rd number :");
x3=input("Please enter 4th number :");

number_tuple = (x,x1,x2,x3)
#print(number_tuple[1])
for num in number_tuple:
    if (num % 5 == 0):
        print("number is devisible by 5 : ",num)

