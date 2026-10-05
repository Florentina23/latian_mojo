package latian_mojo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import latian_mojo1.bank;

public class Main {
	static Scanner scan=new Scanner(System.in);
	static ArrayList<bank> usernameList=new ArrayList<bank>();
	
	public static void homePage()
	{
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
				scan.nextLine();
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
				if(tf>saldo)
				{
					System.out.println("Saldo tidak cukup");
				}
				else
				{
					System.out.println("Berhasil transfer!");
					saldo=saldo-tf;
				}
				
				break;
				
			default:
			 	break;
			}
		} while(menu!=4);
		scan.close();
	}
	
	public static void create()
	{	
		System.out.println("Insert username: ");
		String username=scan.nextLine();
		System.out.println("Insert pin: ");
		Integer pin=scan.nextInt();
		bank bank=new bank(username, pin);
		usernameList.add(bank);
	}
	
	public static void login()
	{
		System.out.println("Insert username: ");
		String username=scan.nextLine();
		System.out.println("Insert pin: ");
		Integer pin=scan.nextInt();
		
		for (int i = 0; i < usernameList.size(); i++) 
		{
			if(usernameList.get(i).username.equals(username) && usernameList.get(i).pin.equals(pin))
			{
				System.out.println("Hallooooo "+username+"!");
				homePage();
			}
			else
			{
				System.out.println("Username not found, please create account");
				create();
			}
			break; 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pilih=-1;
		do {
			System.out.println("1. Create account");
			System.out.println("2. Login account");
			System.out.println("3. Exit");
			System.out.println("Choose menu: ");
			pilih=scan.nextInt();
			scan.nextLine();
			
			switch(pilih)
			{
			case 1:
				create();
				break;
				
			case 2:
				login();
				break;	
			}
		} while (pilih!=3);
	}

}
