import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner InputUser = new Scanner(System.in);
    int nilaiBenar = 6;
    int nilaiTebakan;
    boolean statusTebakan;
    //menebak angka 
    System.out.print("===MASUKAN ANGKA=== \n");
    nilaiTebakan = InputUser.nextInt();
    System.out.print("Nilai tebakam anda adalah " + nilaiTebakan + "\n");
    //menggukan operator logika
    statusTebakan = (nilaiTebakan == nilaiBenar);
    System.out.print("Tebakan anda " + statusTebakan + "\n \n");
    //menggukan operator aljabar boolean
    System.out.print("Masukan nilai antara 4 & 9" + "\n");
    nilaiTebakan = InputUser.nextInt();
    statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
    /*
    untuk &&
    a|b|c
    0 1 0
    1 0 0
    1 1 1
    
    */
    System.out.print("Input anda " + statusTebakan);
  }
}