public class Main {
    public static void main(String[] args) {
        task4();

    }
    public static void task4 () {
        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance < 20){
            days = 1;
            System.out.println("Потребуется дней: "+ days);
        }
        else if (deliveryDistance < 60){
            days = 2;
            System.out.println("Потребуется дней: "+ days);
        }
        else {
            days = 3;
            System.out.println("Потребуется дней: "+ days);
        }
    }
}
