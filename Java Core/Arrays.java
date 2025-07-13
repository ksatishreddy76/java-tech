
class ArrayClass {

    // when we make some thing static that will become class object

    String name;
    int age;
    static String surname;

    public void show() {
        System.out.println(name + "" + age + "" + surname);
    }

    public static void show1(ArrayClass newArray) {
        System.out.println(newArray.name + "" + newArray.age + "" + surname);
    }
}

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayClass newArray = new ArrayClass();
        newArray.name = "Satish";
        newArray.age = 26;
        ArrayClass.surname = "Kolanu";

        ArrayClass newArray2 = new ArrayClass();
        newArray2.name = "Praveen";
        newArray2.age = 26;
        ArrayClass.surname = "Kolanu";

        ArrayClass newArray3 = new ArrayClass();
        newArray3.name = "Raju";
        newArray3.age = 26;
        ArrayClass.surname = "Kolanu";

        newArray.show();
        newArray2.show();
        newArray3.show();

        ArrayClass.show1(newArray);
    }

}
