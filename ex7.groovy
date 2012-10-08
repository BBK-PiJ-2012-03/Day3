println ("Give me your text")
String s = System.console().readLine()
int length = s.length()
int counter = 0
boolean finished = false

String memory = ""
while (!finished) {

for (int i=0 ; i < length ; i++) {

  
 
 println ("Give me your letter to search")
 String s2 = System.console().readLine()


 char c = s.charAt(i)
 memory += s2
 if (c == s2)
 counter++
 

   if ("s2"=="memory")
   finished = true
 }
 
 println (counter)
}



