class  Student{
    int roll;
    String name;
}
public class classObj {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.roll = 2114037;
        obj.name = "Jin Ustad";
        System.out.println(obj.roll);
        System.out.println(obj.name);



        Student obj1 = new Student();
        obj1.roll = 2114039;
        obj1.name = "Gul Mohammad Jin Ustad";
        System.out.println(obj1.roll);
        System.out.println(obj1.name);
    }
}
