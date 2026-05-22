public class ClaassLevalChaining {
 //Class Level constructor Chaining
    ClaassLevalChaining(){
        this(10);
        System.out.println("This is a class level constructor chaining");
    }

    ClaassLevalChaining(int x){
        System.out.println("This is a class level constructor chaining");
    }
    public static void main(String[] args) {
        ClaassLevalChaining c = new ClaassLevalChaining();
    }
}
