public class instance {
    public static void main(String[] args) {
        class A{}
        class B extends A{}
        class C extends B{}
        B b = new B();

        if(b instanceof B)
            System.out.println("true");
        if((b instanceof B) && (! (b instanceof  A)))
            System.out.println("true");
        if((b instanceof B) && (! (b instanceof  A)))
            System.out.println("true");
    }

}
