/*
    Classes & Object
        -Objects are entities in the real world
        - Classes are group of these entites (Collection of similar entities or properties)
                - attributes (Property)
                - functions(behaviors)
*/
public class a {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a Pen object called p1 -> constructor
        p1.setColor("Red");
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    // Properties + functions
    String color;
    int tip;
    
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip; 
    }
}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy,int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}