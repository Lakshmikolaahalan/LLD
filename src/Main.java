public class Main {
    public static void main(String[] args){
        Point p = new Point(10,20);
        Rectangle r = new Rectangle(50,30,p);

        System.out.println("Rectangle Properties:");
        System.out.println("TopLeft point:" + r.topLeft);
        System.out.println("Width:" + r.width);
        System.out.println("Height:" + r.height);
        System.out.println();
        System.out.println("Calculations:");
        System.out.println("Area:" + r.getArea());
        System.out.println("Perimeter:" + r.getPerimeter());
        Point bottomRight = r.getBottomRight();
        System.out.println("BottomRight Point:" + bottomRight);



       /* Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        //s1.display();
        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";
        swap(s1,s2);
        s1.display(); */

        //Student s2 = s1;
        //int tempAge = s1.age;
        //s1.age = s2.age;
        //s2.age = tempAge;
        //s2.display();
        //s1.display();
        //System.out.println("Hello Java!");

    }
    /* private static void swap(Student s1,Student s2){
        //int tage = s1.age;
        //s1.age = s2.age;
        //s2.age = tage;
        //String tname = s1.name;
        //s1.name = s2.name;
        //s2.name = tname;
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    } */
}
