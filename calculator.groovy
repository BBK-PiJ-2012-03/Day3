println ("Give me the first number")

String s = System.console().readLine()
double num1 = Double.parseDouble(s)

println ("Give me the second number")

String str = System.console().readLine()
double num2 = Double.parseDouble(str)


println ("Now select an operation from the menu:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division")

String str2 = System.console().readLine()
int choice = Integer.parseInt(str2)

double result = 0


switch (choice) {

case 1:
result = num1 + num2
break;

case 2:
result = num1 - num2
break;

case 3:
result = num1*num2
break;

case 4:
result = num1/num2
break;


}

println (result)


