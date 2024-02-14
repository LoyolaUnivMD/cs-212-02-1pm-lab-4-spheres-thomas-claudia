
/** Programmers:  Thomas and Claudia
* Course:  CS 212
* Due Date: 2/18/24
* Lab Assignment: 4
* Problem Statement: Create a sphere class that has the radius and location
* Data In: x, y, z, radius
* Data Out: area, volume, distance, if it collides with another sphere
* Credits: none
*/


class Sphere {
    //initializes the variables for location in 3d space and the radius
    double x;
    double y;
    double z;
    double radius;

    //constructor that takes in x, y, z, and radius and assigns them
    public Sphere(double x, double y, double z, double radius){
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;

    }
    //calculates and returns tha area using 4 * pi * radius to the power of 2
    public double Area(){
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    //calculates and returns the volume using 4/3 * pi * radius to the power of 2
    public double volume(){
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    //calculates the distance between the sphere and a location
    public double Distance(double x, double y, double z){
        //returns x1-x2 to the power of 2 + y1 - y2 to the power of 2 + z1 - z2 to the power of 2 and then takes the square root
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z - z , 2));
    }

    //checks if 2 spheres collide with each other
    public boolean collide(Sphere sphere2){
        //gets the distance between the 2 by using the Distance method and passing in the 2nd sphere's x, y, and z
        double distance = Distance(sphere2.x, sphere2.y, sphere2.z);
        //calculates the sum of the 2 sphere's radius
        double radiusSum = radius + sphere2.radius;
        //if the distance is less than the sum of the radius
        if (distance < radiusSum){
            //returns true
            return true;
        }
        //otherwise returns false
        return false;
    }
}
