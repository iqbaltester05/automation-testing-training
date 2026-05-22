class Test extends Test2{
  Test(){
    super(20);
  }
   String c="gfdg";
  public static void main(String[] args) {
 
  Test t=new Test();
    System.out.println(t.a);
    System.out.println(t.c);
    System.out.println("Test1 with int and int data Constructor");
  }


}

class Test2{
  
  Test2(int y){
    System.out.println("Test2 Constructor");
  }

  String a="abc";
}