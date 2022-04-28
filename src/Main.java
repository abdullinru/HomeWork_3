public class Main {
    public static void main(String[] args) {
        task5();

    }
    public static void task5 () {
        int monthNumber  = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("некорректно введен номер месяца");

        }


    }
}
