println ("Give me your text")
String s = System.console().readLine()
int length = s.length()
int counter = 0
boolean finished = false

String memory = ""



while (!finished) {

 println ("Give me your letter to search")
 String s2 = System.console().readLine()



for (int i=0 ; i < length ; i++) {

 for (int j=0 ; j < memory.length() ; j++)
 {	
	if (s2 == memory.charAt(j))
	finished = true 
 }

 if (finished)
	break;

 
	
 char c = s.charAt(i)
 
 if (c == s2)
 counter++
 
 }
 
 if (finished)
 {
     println ("Repeated character. Exiting the program...\nThank you for your cooperation. Good bye!")
     break;
 }


 println ("There are " + counter + " in your text")
 counter = 0
 memory += s2
 
 
}


