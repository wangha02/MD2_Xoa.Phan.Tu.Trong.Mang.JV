import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j, i, k;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhap so phan tu cua mang?!"); // nhập số phần tử của mảng
            j = scanner.nextInt();
        } while (j <= 0);
        System.out.println("nhap phan tu khoi tao cho mang?!" + "\n");// nhập phần tử cho mảng
        int News[] = new int[j];

        for (i = 0; i < j; i++) {
            News[i] = scanner.nextInt();
        }
        System.out.println("nhap so x trong mang muon xoa : ");//  nhập phần tử thứ trong mảng
        int x = scanner.nextInt();

        for (k = i = 0; i < j; i++) {
            if (News[i] != x) {
                News[k] = News[i];
                k++;
            }
        }
        j = k; // lúc này số phần tử trong mảng sẽ bằng k;

        System.out.println("Mang con lai sau khi xoa element " + x + "là ");
        for (i = 0; i < j; i++) {
            System.out.print(News[i] + " ");
        }
    }
}



