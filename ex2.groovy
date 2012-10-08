println ("Give me a mathematical operation")

String input = System.console().readLine()

String firstNum = input.charAt(0)
String operation = input.charAt(1)
String secondNum = input.charAt(2)



double num1 = Double.parseDouble(firstNum)
double num2 = Double.parseDouble(secondNum)
double result = 0


switch (operation) {

case "+":
result = num1 + num2
break;

case "-":
result = num1 - num2
break;

case "*":
result = num1*num2
break;

case "/":
result = num1/num2
break;


}

println (result)