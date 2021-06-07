userNumber1 = int(input( "Enter a number1 : " ))
userNumber2 = int(input( "Enter a number2 : " ))
userNumber3 = int(input( "Enter a number3 : " ))
userNumber4 = int(input( "Enter a number4 : " ))
numberList = [userNumber1, userNumber2, userNumber3, userNumber4]
fristElement = numberList[0]
lastElement =  numberList[-1]
if(fristElement == lastElement):
    print(True)
else:
    print(False)
