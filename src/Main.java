public class Main {
    public static void main(String[] args) {
        task3();

    }
    public static void task3 () {
        int year = 1104;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является весокосным");
        }
        else {
            System.out.println("Год не является весокосным");
        }
    }
}
