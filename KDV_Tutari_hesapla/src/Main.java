import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Double ucret;
        System.out.println("Lütfen ücreti giriniz!");
        ucret = scan.nextDouble();
        double kdvTutari = (ucret / 100) * 18;
        double kdv_dahil_tutar = ucret + kdvTutari;
        System.out.print("KDV dahil ücret tutarı:" + "" + kdv_dahil_tutar);
    }


}