println ("Give me your text")
String s = System.console().readLine()
int length = s.length()
int counter

for (int i=0 ; i < length ; i++) {
char c = s.charAt(i)
if (c== "e")
counter++
}

println (counter)