package latian_mojo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		
		ArrayList<String> bankSystem=new ArrayList<String>();
		double saldo=0;
		
		int menu=-1;
		do {
			System.out.println("1. Lihat Saldo");
			System.out.println("2. Topup Saldo");
			System.out.println("3. Transfer");
			System.out.println("4. Logout");
			System.out.print("Choose menu: ");
			menu=scan.nextInt();
			scan.nextLine();
			
			switch (menu)
			{
			case 1:
				System.out.println("Saldo anda Rp. "+saldo);
				break;
				
			case 2:
				double topup=0;
				System.out.println("Saldo yang ingin di topup Rp.");
				topup=scan.nextDouble();
				saldo=saldo+topup;
				System.out.println("Saldo anda Rp. "+saldo);
				break;
				
			case 3:
				int rek;
				double tf;
				System.out.println("Rekening yang ingin di transfer: ");
				rek=scan.nextInt();
				System.out.println("Saldo yang ingin di transfer Rp. ");
				tf=scan.nextDouble();
				break;
				
			default:
			 	break;
			}
		} while(menu!=4);
	}

}
