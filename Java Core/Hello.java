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
                        : (age > 17 && age <= 60) ? "Adult"
                                : (age > 60 && age <= 150) ? "Senior Citizen" : "Not a valid age";

    }

    public void loopTable(int num1) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num1);
        }
    }

    public boolean checkIsPalindrome(String val) {
        String reverseValue = "";

        for (int i = val.length() -1; i >= 0; i--) {
            Character newAlpabet = val.charAt(i);

            System.out.println(newAlpabet);
            reverseValue = reverseValue + newAlpabet;
        }

        System.out.println(reverseValue);
        System.out.println(val);

        return val.equals(reverseValue);

    }

    static boolean contains(char c, char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(c);
            System.out.println(array[i]);
            if (array[i] == c) {
                return true;
            }
        }

        return false;
    }

    public String checkAlphabetIsVowel(char letter) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char smallChar = Character.toLowerCase(letter);
        return !contains(smallChar, vowels) ? "consonant" : "vowel";
    }
}

public class Hello {

    public static void main(String args[]) {

        SimpleProjects simpleProject = new SimpleProjects();

        // System.out.println(simpleProject.checkOddOrEven(7));
        // System.out.println(simpleProject.ageChecker(61));
        // System.out.println(simpleProject.checkAlphabetIsVowel('C'));
        System.out.println(simpleProject.checkIsPalindrome("SANAS"));
        // simpleProject.loopTable(20);

        // System.out.println("Hello World");

    }

}
