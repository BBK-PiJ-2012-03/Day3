class Point {
double x;
double y;


}



class Rectangle {
Point upLeft = new Point();
Point downRight = new Point();
Point thirdPoint = new Point();
}

Rectangle myrect = new Rectangle();



println ("Give me the coordinate x of the upLeft point of a rectangle")
String s = System.console().readLine()
myrect.upLeft.x = Double.parseDouble(s);

println ("Give me the coordinate y of the upLeft point of a rectangle")
String s2 = System.console().readLine()
myrect.upLeft.y = Double.parseDouble(s2);

println ("Give me the coordinate x of the downRight point of a rectangle")
String s3 = System.console().readLine()
myrect.downRight.x = Double.parseDouble(s3);

println ("Give me the coordinate y of the downRight point of a rectangle")
String s4 = System.console().readLine()
myrect.downRight.y = Double.parseDouble(s4);

println ("Give me the coordinate x of the point to be examined if its in or out the rectangle")
String s5 = System.console().readLine()
myrect.thirdPoint.x = Double.parseDouble(s5);


println ("Give me the coordinate y of the point to be examined if its in or out the rectangle")
String s6 = System.console().readLine()
myrect.thirdPoint.y = Double.parseDouble(s6);

if ( ((myrect.thirdPoint.x) >= (myrect.upLeft.x)) && ((myrect.thirdPoint.x) <= (myrect.downRight.x)) && ((myrect.thirdPoint.y) >= (myrect.downRight.y)) && ((myrect.thirdPoint.y) <= (myrect.upLeft.y)))
println ("The third point is INSIDE the recangle")
else
println ("The third point is OUTSIDE the recangle")