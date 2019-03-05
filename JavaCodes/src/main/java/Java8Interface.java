public interface Java8Interface {

    default void newMethod(){
        System.out.println("Inside the new Default Method");
    }

    void olderMethod();

    static void newStaticMethod(){
        System.out.println("New Static Method in JAVA 8");
    }
}
