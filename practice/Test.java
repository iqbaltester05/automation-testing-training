class Test {

    int instanceVar = 10;
    static int staticVar = 20;

    void show() {
        int localVar = 30;

        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        Test d = new Test();
        d.show();
    }
}