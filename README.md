# Lab 4 -- The music of the spheres
Due: 2/18   
**50 points**			

## Purpose:  
This assignment will give you a chance to practice the following:

1. Designing your own class in Java
2. Creating/Using constructor
3. Creating/Using methods

## Problem
A sphere is a rounded shape 3-dimensional object which has a center and a radius. In computer games, spheres are used to model many objects: the sun, the moon, the earth, a canonball, a soccer ball, a baseball, a raindrop, etc... You will create a new class named Sphere and use it to create sphere objects and to detect sphere collisions.

**If you want a quick read about spheres go [here](https://byjus.com/maths/sphere/#:~:text=A%20sphere%20is%20a%20three,vertices%2C%20like%20other%203D%20shapes).**

## Design: 
Your Sphere should have at least a radius and a position in a 3D Cartesian space (i.e., x-y-z space). 

Your Sphere must have the following methods:  
1. A default constructor 
2. A constructor that sets the center and radius by accepting 4 double values (3 for the coordinates and 1 for the radius)  
3. A method to calculate the surface area of the sphere.  
    * $Area = 4 * pi * r^2$  
4. A method to calculate the volume of the sphere.  
    * $Volume = 4/3 * pi * r^3$
5. A method to calculate the distance from the center of a sphere to an arbitrary point in space.
    * $Distance = \sqrt{ (x_1-x_2)^2 + (y_1-y_2)^2 + (z_1-z_2)^2}$ 
6. A method to detect whether a sphere collides with another sphere (i.e., the spheres intersect).  
    * The spheres intersect if the distance between the centers is less than the sum of the two radii.  
 


## Additional Requirements

1. Before coding, produce *design.txt*. Each data member should be listed along with type. Each method in your class needs a name, return type, list of parameters (if any).
2. Before coding, produce *testcases.txt*. This should contain a list of at leat 3 test cases suitable to this program. You may test any aspect of this program, but be clear about what is being tested.
3. Your class as described above should be in a file named **Sphere.java**
4. Create a **Main.java** file that performs the following tasks:  
    * Initializes three spheres:
        * sun at 0.0, 0.0, 0.0 with a radius of 43.26
        * earth at 26.0, 42.0, 79.0 with a radius of 0.395
        * planetX at 25.3, 43.1, 77.8 with a radius of 1.4
    * Prints out the volume and surface area of each of the three spheres.
    * Prints out whether any of the spheres have collided.
    * Extra Credit: 
        * Asks the user for a location in space. (with error checking)
        * Tell the user which sphere that location is closest to. 
5. Remember, following good programming practices is part of your grade. They include filling out the header of your code (comments on top about the assignment, input, output), commenting throughout your code, using white spaces to make your code more readable and lastly being consistent and considerate on naming your variables.       
## What to Submit:

To **GitHub**, one per group:
1. design.txt with the design of your class
2. testcases.txt with your testcases
3. Sphere.java and Main.java with all code you wrote

To **Moodle**, indiviually:
* a short **reflection** of 200 words minimum. Your reflection should address the following questions:
    * what you learned in Lab 4
    * what you think about classes so far
    * what was easiest, hardest, and most interesting about the lab
    * how it was working with you partner
* **This is part of your participation grade**







