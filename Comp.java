import java.util.Random;
import java.util.Scanner;

public class Comp {
    String cpu;
    String ram;
    String hdd;
    final Integer resource = 3;

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public Integer getResource() {
        return resource;
    }

    public Comp(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void comp_on() {
        Scanner sc = new Scanner(System.in);
        int status;
        int i = 0;
        int k;
        Random random = new Random();
        while (i < resource * 2) {

            if (i % 2 == 0) {
                System.out.println("Попытайтесь включить комп!");
                System.out.println("Введите число 0 или 1");
                status = sc.nextInt();
                k = random.nextInt(2);
                if ((status == 0) || (status == 1)) {
                    if (status == k) {
                        System.out.println("Комп включен");
                        i++;
                    } else {
                        System.out.println("Комп сгорел. Рандом = " + k);
                        break;
                    }
                } else
                    System.out.println("Вы ввели неверное число");
            } else {
                System.out.println("Попытайтесь выключить комп");
                System.out.println("Введите число 0 или 1");
                status = sc.nextInt();
                k = random.nextInt(2);
                if ((status == 0) || (status == 1)) {
                    if (status == k) {
                        System.out.println("Комп выключен");
                        i++;
                    } else
                        i = resource * 2;
                } else {
                    System.out.println("Комп сгорел. Рандом = " + k);
                    break;
                }
            }
        }
        if (i >= resource * 2)
            System.out.println("Комп сгорел. Превышен ресурс полных циклов работы.");
    }
}
