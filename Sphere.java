
/** Programmers:  [your names here]
* Course:  CS 212
* Due Date:
* Lab Assignment:
* Problem Statement:
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/


class Sphere {
    double x;
    double y;
    double z;
    double radius;
    public Sphere(double x, double y, double z, double radius){
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;

    }
    public double Area(){
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    public double volume(){
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
    public double Distance(Sphere sphere2){
        return Math.sqrt(Math.pow(x - sphere2.x, 2) + Math.pow(y - sphere2.y, 2) + Math.pow(z - sphere2.z , 2));
    }
    public boolean collide(Sphere sphere2){
        double distance = Distance(sphere2);
        double radiusSum = radius + sphere2.radius;
        if (distance < radiusSum){
            return true;
        }
        return false;
    }
}
