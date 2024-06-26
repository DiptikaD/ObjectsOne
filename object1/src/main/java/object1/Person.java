package object1;
// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    private String name;
    private int age = 0;
    private int height = 0;
    //height is cm

    public String getName (String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge (int age){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }

    public int getHeight (int height){
        return height;
    }
    public void setHeight (int height){
        this.height = height;
    }



    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object


        //System.out.println(Person.person1("Kate", 18, 130));
        /* Now you can use the Object `person1` */

    }
}
