println ("Give me the total cost of the purchase")
String s = System.console().readLine()
double totalCost = Double.parseDouble(s)

println ("Give me the amount of money that is paid")
String s2 = System.console().readLine()
double moneyPaid = Double.parseDouble(s2)

double change = moneyPaid - totalCost

int result50
int remainder50
if (change > 50)  {
result50 = change/50
remainder50 = change%50
}


int result20
int remainder20
if (remainder50 > 20) {
result20 = remainder50/20
remainder20 = remainder50%20
}

int result10
int remainder10
if (remainder20 > 10) {
result10 = remainder20/10
remainder10 = remainder20%10
}

int result5
int remainder5
if (remainder10 > 5) {
result5 = remainder10/15
remainder5 = remainder10%5
}

if (result50!=0) 
print ("Your change is " +result50 + " notes of 50")

if (result20!=0)
print (", " + result20 + " notes of 20 ")

if (result10!=0)
print (", " + result10 + " notes of 10 ")

if (result5!=0)
print (", " + result5 + " notes of 5 ")





