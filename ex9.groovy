println ("Give me your text")
String normal = System.console().readLine()
String reversed = ""
int length = normal.length()


for(int i = length - 1 ; i >  -1 ; i--)
{
	char last = normal.charAt(i)
	reversed += last

}

println (normal + reversed)



