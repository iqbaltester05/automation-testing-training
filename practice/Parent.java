class Parent extends Object{  //super class

    {
        System.out.println("hiii");
    }
    public void land(){
        System.out.println("father has land");
    }

    String watch="Rolex";
}

class Mother{  //super class

    public void land(){
        System.out.println("Mother has land");
    }

    String watch="xyz";

}





class Child extends Parent{  //sub class

    Child(){
        super();
    }

    public void house(){
        System.out.println("child has house");
    }
    String car="Swift";
    public static void main(String[] args) {
    Child child=new Child(20);
    child.land();
    String parentwatch=child.watch;
    System.out.println(parentwatch);

    child.house();
    System.out.println(child.car);
    }
}





//Inheritance, polimorphism, Encapsulation interfacew, Abstraction

//inheritance
//1. Single Level
//2. Multi level
//3. Multiple
// Hierarical