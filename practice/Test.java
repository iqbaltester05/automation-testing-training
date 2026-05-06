class Test{
  Test(){
    this(20);
    System.out.println("non argumented running");
  }

  Test(int webdriver){
    this("hello");
     System.out.println("webriver argumented running");
  }
  Test(String AndroidDriver){
    this(true,"bye");
     System.out.println("androiddriver argumented running");
  }

  Test(boolean a, String b){
     System.out.println("multiople argumented running");
    
  }
  public static void main(String[] args) {
    Test t=new Test();
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