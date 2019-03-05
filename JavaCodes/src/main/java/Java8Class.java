public class Java8Class implements Java8Interface {
    @Override
    public void olderMethod() {
        System.out.println("Older method implemented in class");
    }

    public static void main(String args[]){
        Java8Class obj = new Java8Class();
        obj.olderMethod();
        obj.newMethod();
        Java8Interface.newStaticMethod();
    }
}
