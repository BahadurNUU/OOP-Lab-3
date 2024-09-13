import java.util.Random;

public class Main {
    public static void main(String[] args) {
//    Rectangle rect1 = new Rectangle();
//        System.out.println("Area: " + rect1.calcArea());
//        System.out.println("Perimeter: " + rect1.calcPerimeter());
//        Invoice invoice = new Invoice("A365", "new item", 42, 25.49);
//        System.out.println("Total price: " + invoice.getInvoiceAmount());
//        System.out.println("Part Number: " + invoice.getNum());
//        System.out.println("Description: " + invoice.getDescription());
//        System.out.println("Quantity: " + invoice.getQuantity());
//        System.out.println("Price: " + invoice.getPrice());
//
//        invoice.setPrice(-23.56);
//        System.out.println("Price after modification: " + invoice.getPrice());
//        int[] arr = new int[100000];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Random().nextInt(1, 100000);
//        }
//
//        StopWatch stopWatch = new StopWatch();
//        SelectionSort sorted = new SelectionSort();
//        stopWatch.start();
//        sorted.sort(arr);
//        stopWatch.stop();
//        System.out.println("Elapsed time: " + stopWatch.getElapsedTime());


        SavingsAccount saver1 = new SavingsAccount(2000);
        System.out.println("Monthly interest rate: " + saver1.calculateMonthlyInterest());

        SavingsAccount saver2 = new SavingsAccount(3000);
        System.out.println("Monthly interest rate: " + saver2.calculateMonthlyInterest());


    }
}