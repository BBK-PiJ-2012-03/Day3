println ("Give me tour text")
String s = System.console().readLine()
int length = s.length()

for (int i=0 ; i < length ; i++) {
char c = s.charAt(i)
println (c)
}