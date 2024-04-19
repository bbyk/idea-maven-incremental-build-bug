package bbyk.bugreports;

public class Parent {
    public static String sayKnownFor() {
        return "Experience, whose parent known for " + Grandpa.sayKnownFor();
    }
}
