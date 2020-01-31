package main;

import main.SbBankNumberVeryficator;
import java.util.Scanner;
 

public class SbStarter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Witaj!!!!!\nPodaj numer rachunku bankowego,\na ja sprawdzê czy jest poprawny");
		String answear = sc.nextLine();
		
		SbBankNumberVeryficator bNV = new SbBankNumberVeryficator(answear);
				
		System.out.println("PODANY NI¯EJ NRB:\n" + answear+"\njest:" + bNV.checkIfBankNumberIsCorrect());
		
		System.out.println("DZIEKUJÊ ZA INTERAKCJÊ!!!!\nDO WIDZENIA");
		sc.close();

	}

}
