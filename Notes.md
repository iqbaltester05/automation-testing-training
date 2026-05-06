give real time examples on notes


classTest{

int driver;

Test(intdriver){

this.driver=driver;

  }

publicstaticvoid main(String[] args){

Testt= newTest(20);

System.err.println(t.driver);

  }

}

//number or argument and same data type is not allowed
number of argument with different data types are allowed

diufferet num of argument and position change is allowed
number of argument must be diff





classTest{

Test(){

System.out.println("non argumented constructor running");

  }

Test(intb){

System.out.println("argumented constructor running");

  }

Test(intx,Stringz){

  }

  {

    System.out.println("non static block running");

  }

static{

    System.out.println("static block running");

int a=20;

  }

publicstaticvoid main(String[] args){

Testt= newTest(20,"hii");

  }

}





classTest{

Test(){

this(20);

System.out.println("non argumented running");

  }

Test(intwebdriver){

this("hello");

System.out.println("webriver argumented running");

  }

Test(StringAndroidDriver){

this(true,"bye");

System.out.println("androiddriver argumented running");

  }

Test(booleana,Stringb){

System.out.println("multiople argumented running");

  }

publicstaticvoid main(String[] args){

Testt=newTest();

  }

}

//What is a Constructor in Java?

//Job of Constructor //predefined //userdefined

//Types of constructor

//Can User Call Constructor Manually?

//Types of User-Defined Constructor

//Parameterized Constructor

//Can We Create Static Constructor?

//Constructor Overloading

//Non-Static Control Flow

//Constructor Chaining //this and this()

//Access Specifiers with Constructor
