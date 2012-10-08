println ("Give me the total cost of the purchase")
String s = System.console().readLine()
double totalCost = Double.parseDouble(s)

println ("Give me the amount of money that is paid")
String s2 = System.console().readLine()
double moneyPaid = Double.parseDouble(s2)

double change = moneyPaid - totalCost

//calculations


int result50 = change/50
int remainder50 = change%50

int result20 = remainder50/20
int remainder20 = remainder50%20

int result10 = remainder20/10
int remainder10 = remainder20%10

int result5 = remainder10/5
int remainder5 = remainder10%5

int result2 = remainder5/2
int remainder2 = remainder5%2

int result1 = remainder2/1
int remainder1 = remainder2%1

//prints

if (result50!=0) 
print ("Your change is " +result50 + " notes of 50, " )

if (result20!=0)
print (result20 + " notes of 20, ")

if (result10!=0)
print (result10 + " notes of 10, ")

if (result5!=0)
print (result5 + " notes of 5, ")

if (result2!=0)
print (result2 + " coins of 2, ")

if (result1!=0)
print (result1 + " coins of 1, ")


//small coins thing 

int Peng = change*100 
int trick = change


int PengResult  = Peng - (trick*100)





// Pennes calculations

int result50p = PengResult/50
int remainder50p = PengResult%50
 
int result20p = remainder50p/20
int remainder20p = remainder50p%20
 
int result10p = remainder20p/10
int remainder10p = remainder20p%10
 
int result5p = remainder10p/5
int remainder5p = remainder10p%5

int result2p = remainder5p/2
int remainder2p = remainder5p%2
 
int result1p = remainder2p/1
int remainder1p = remainder2p%1




if (result50p!=0) {
print (result50p + " coins of 0.50, " )
}
if (result20p!=0) {
print (result20p + " coins of 0.20, ")
}
if (result10p!=0){
print (result10p + " coins of 0.10, ")
}
if (result5p!=0) {
print (result5p + " coins of 0.05, ")
}
if (result2p!=0) {
print (result2p + " coins of 0.02, ")
}
if (result1p!=0) {
print (result1p + " coins of 0.01, ")
}