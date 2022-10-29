import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int r,centerArea;
        double pi=3.14,alan,alan2;
        Scanner input =new Scanner(System.in);
        System.out.print("yarıçapı giriniz=");
        r=input.nextInt();
        System.out.print("merkez çapını giriniz=");
        centerArea=input.nextInt();
        alan=(pi*(r*r)*centerArea)/360;
        System.out.print("daire diliminin alanı="+alan);
        alan2=(pi*(r*r)*centerArea)/320;
        System.out.println(alan2);
    }
}
