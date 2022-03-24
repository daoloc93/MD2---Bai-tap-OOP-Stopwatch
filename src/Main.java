import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number[] = new int[100000];


        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100000);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn một số ngẫu nhiên từ 0 đến 100000: ");
        int input = sc.nextInt();
        int index = 0;
        boolean flag = false;

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == input) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Số cần tìm ở vị trí thứ " + index + " trong mảng");
        } else {
            System.out.println("Số vừa cho không có trong mảng");
        }

        stopWatch.stop();

        System.out.println("Thời gian thực hiện thuật toán: " + stopWatch.getElapsedTime() + " mili giây");
    }
}

