class Calculator {
    public void showMessage() {
        System.out.println("Show Message");
    }

    public int addTwoValues(int a, int b) {
        return a + b;
    }
}

class SimpleProjects {
    public void simpleTasks() {
        System.out.println("simple tasks");
    }

    public String checkOddOrEven(int num1) {
        return (num1 % 2 == 0) ? "Even" : "Odd";
    }

    public String ageChecker(int age) {
        return (age > 0 && age <= 12) ? "Child"
                : (age > 12 && age <= 17) ? "Teenager"
                        : (age > 17 && age <= 60) ? "Adult" : (age > 60 && age <= 150) ? "Senior Citizen" : "Not a valid age";

    }
}

public class Hello {

    public static void main(String args[]) {

        SimpleProjects simpleProject = new SimpleProjects();

        System.out.println(simpleProject.checkOddOrEven(7));
        System.out.println(simpleProject.ageChecker(61));

        // System.out.println("Hello World");

    }

}
