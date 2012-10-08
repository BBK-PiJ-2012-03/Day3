println ("Give me your text")
String normal = System.console().readLine()
String reversed = ""
int length = normal.length()


for(int i = length - 1 ; i >  -1 ; i--)
{
	char last = normal.charAt(i)
	reversed += last

}



if (reversed == normal) {
println ("Yes it is")}
else println ("No its not")



