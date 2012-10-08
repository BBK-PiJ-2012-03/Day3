println ("Give me your text")
String s = System.console().readLine()
int length = s.length()
int counter = 0

println ("Give me your letter to search")
String s2 = System.console().readLine()

for (int i=0 ; i < length ; i++) {
char c = s.charAt(i)
if (c== s2)
counter++
}

println (counter)