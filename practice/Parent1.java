class Parent1 {   // Parent class

    public String cook() {
        return "chrome";
    }
}

class Child extends Parent1 {

    @Override
    public String cook() {
        return "edge";
    }

    public static void main(String[] args) {

        Parent1 p = new Parent1();
        p.cook();

        Child c = new Child();
        c.cook();
    }
}