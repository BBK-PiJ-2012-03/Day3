println ("Give me a number")
s = System.console().readLine()
int length = s.length()
int comaLocation = 0
int dotLocation = 0



for (int i=0 ; i < length ; i++) {
char c = s.charAt(i)
if (c== ",")
comaLocation = i
}

for (int j=0 ; j< length ; j++) {
char c = s.charAt(j)
if (c== ".")
dotLocation = j
}


if ((comaLocation!=0) && (dotLocation!=0)) {
String firstPart = s.substring(0,comaLocation)
String secondPart = s.substring(comaLocation+1,dotLocation)
String lastPart = s.substring(dotLocation+1)




int num1 = Integer.parseInt(firstPart)
int num2 = Integer.parseInt(secondPart)
int num3 = Integer.parseInt(lastPart)



double number = ((1000*num1)+num2+(num3/100))

println (number/2)


}