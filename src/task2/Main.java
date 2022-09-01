package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);
        String rq;
        MyList myList = new MyList();
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter element - ");
            myList.method(hw.next());

            System.out.print("Enter r if you want to continue \nand enter q if you want stop ");
            rq = hw.next();
            if (rq.equals("r")) {
                continue;
            }
            if (rq.equals("q")) {
                System.out.print("Enter index - ");
                myList.index = hw.nextInt();
                try {
                    System.out.println(myList.toString());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid index");
                    continue;
                }
            } else {
                System.out.println("You can use only r or q");
                continue;
            }
            break;
        }
    }
}
