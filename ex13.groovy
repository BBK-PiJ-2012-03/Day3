class Point {
double x;
double y;


}



class Rectangle {
Point upLeft = new Point();
Point downRight = new Point();
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

double side1 = ((myrect.upLeft.x - myrect.downRight.x).abs())
double side2 = ((myrect.upLeft.y - myrect.downRight.y).abs())

double perimeter = ((2*side1+2*side2))
double area = (side1*side2)

println ("The perimeter of this rectangle is " + perimeter + " and the area is " + area)




