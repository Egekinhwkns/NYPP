package Project1;

import java.util.Random;

public class Game {

	private String equation;
	private boolean gameOn;
	
	//yeni oyuna tıklayınca generate equation calısıcak.
	public Game() {
		gameOn = true;
	}
	
	public String generateEquation() {
		
		// 1 işaret veya 2 işaret seçimi için random değer olusturuyorum.
		Random rand = new Random();
		int upperbound = 2;
		int int_random = rand.nextInt(upperbound);  
		
		// eğer tek işaret ise:
		if(int_random==0) {
			String sayi1,isaret1,sayi2,esittir,sonuc;
			int intSonuc,intSayi1,intSayi2;
			
			upperbound = 999;
			//sayi1 için random değer:
			intSayi1 = rand.nextInt(upperbound);
			sayi1 = Integer.toString(intSayi1);
			//sayi2 için random değer:
			intSayi2 = rand.nextInt(upperbound);
			sayi2 = Integer.toString(intSayi2);
			//isaret:
			upperbound = 4;
			int_random = rand.nextInt(upperbound);
			if(int_random==0) {
				intSonuc=intSayi1+intSayi2;
				isaret1="+";
			}
			else if(int_random==1) {
				intSonuc = intSayi1-intSayi2;
				isaret1="-";
			}
			else if(int_random==2) {
				intSonuc = intSayi1*intSayi2;
				isaret1="*";
			}
			else {
				intSonuc=intSayi1/intSayi2;
				isaret1="/";
			}
			
			// esittir:
			esittir = "=";
			//sonuc
			sonuc = Integer.toString(intSonuc);
			
			//olusan denklem:
			equation = sayi1+isaret1+sayi2+esittir+sonuc;
			System.out.println(equation);
			
		}
		//çift işaret ise:
		else {
			
			String sayi1,isaret1,sayi2,isaret2,sayi3,esittir,sonuc;
			int intSayi1,intSayi2,intSayi3,intSonuc;
			
			upperbound = 999;
			//sayi1 için random değer:
			intSayi1 = rand.nextInt(upperbound);
			sayi1 = Integer.toString(intSayi1);
			//sayi2 için random değer:
			intSayi2 = rand.nextInt(upperbound);
			sayi2 = Integer.toString(intSayi2);
			//sayi3 için random değer:
			intSayi3 = rand.nextInt(upperbound);
			sayi3=Integer.toString(intSayi3);
			//isaret1:
			upperbound=4;
			int_random=rand.nextInt(upperbound);
			if(int_random==0) {
				isaret1="+";
			}
			else if(int_random==1) {
				isaret1="-";
			}
			else if(int_random==2) {
				isaret1="*";
			}
			else {
				isaret1="/";
			}
			//isaret2:
			int_random=rand.nextInt(upperbound);
			if(int_random==0) {
				isaret2="+";
			}
			else if(int_random==1) {
				isaret2="-";
			}
			else if(int_random==2) {
				isaret2="*";
			}
			else {
				isaret2="/";
			}
			//esittir:
			esittir="=";
			
			//işlem sırası kontrolü:
			if(isaret1=="*" || isaret1=="/") {
				if(isaret1=="*") {
					intSonuc = intSayi1*intSayi2;
				}
				else{
					intSonuc=intSayi1/intSayi2;
				}
				//isaret2'nin işlemi:
				if(isaret2=="+") {
					intSonuc+=intSayi3;
				}
				else if(isaret2=="-") {
					intSonuc-=intSayi3;
				}
				else if(isaret2=="*") {
					intSonuc*=intSayi3;
				}
				else {
					intSonuc/=intSayi3;
				}
			}
			else {
				if(isaret2=="*" || isaret2=="/") {
					if(isaret2=="*") {
						intSonuc=intSayi2*intSayi3;
					}
					else {
						intSonuc=intSayi2/intSayi3;
					}
				}
			}
		}
		return null;
	}

	public void printx() {
		System.out.println(equation.charAt(0)); //Stringde belirtilen yerdeki karakteri seçiyor
	}
	
	public void start() {
		while(gameOn) {
			
			//oyun kısmı
			
		}
	}
}
