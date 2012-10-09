class Point {
double x;
double y;


}

Point point1 = new Point();
Point point2 = new Point();
Point point3 = new Point();

println ("Give me the coordinate x of first point")

String s = System.console().readLine()
point1.x = Double.parseDouble(s);


println ("Give me the coordinate y of first point")

String s2 = System.console().readLine()
point1.y = Double.parseDouble(s2);


println ("Give me the coordinate x of second point")

String s3 = System.console().readLine()
point2.x = Double.parseDouble(s3);


println ("Give me the coordinate y of second point")

String s4 = System.console().readLine()
point2.y = Double.parseDouble(s4);

println ("Give me the coordinate x of third point")

String s5 = System.console().readLine()
point3.x = Double.parseDouble(s5);

println ("Give me the coordinate y of third point")

String s6 = System.console().readLine()
point3.y = Double.parseDouble(s6);



double distance12 = (Math.pow((point1.x-point2.x),2) + Math.pow((point1.y-point2.y),2))
double distance13 = (Math.pow((point1.x-point3.x),2) + Math.pow((point1.y-point3.y),2))
double distance23 = (Math.pow((point2.x-point3.x),2) + Math.pow((point2.y-point3.y),2))

//actually the distances that i calculated were the second power of the real distances. But i only had to compare them by themselves so there is no problem.



if ((distance12 < distance13) && (distance12 < distance23))
println ("The first two points are closer to each other")

if ((distance13 < distance12) && (distance13 < distance23))
println ("The first and the third points are closer to each other")

if ((distance23 < distance13) && (distance23 < distance12))
println ("The last two points are closer to each other")


 
