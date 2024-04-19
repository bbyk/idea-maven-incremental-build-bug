package bbyk.bugreports;

public class Child {
    public static String sayKnownFor() {
        return "Exuberance, whose parent known for " + Parent.sayKnownFor();
    }

    public static void main(String[] args) {
        System.out.println(sayKnownFor());
    }
}
