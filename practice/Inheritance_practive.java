public class Inheritance_practive {
    static void driver(String driverName){
        System.out.println("chrome driver running");
    }

    public static void driver(String driverName, String server){
    System.out.println("adndroid Driver created");
    }

    public static void driver(String databaseName, int port, String url){
    System.out.println("m3 running");
    }

    public static void main(String[] args) {
        driver("chrome");
        driver("AndroidDriver", "https://localhost:4723");
        driver("SQL",5821,"https://aws/,db");
    }
    
}


//Access Modifier: same, different
//return : same, different
//method name : same
//Argument: different


//Polimorphism

//type.   Compile time polimorphisrm and run time polimorphism