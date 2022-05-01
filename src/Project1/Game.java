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
		//deneme
		// 1 işaret veya 2 işaret seçimi için random değer olusturuyorum.
		Random rand = new Random();
		int upperbound = 2;
		int int_random = rand.nextInt(upperbound);  
		int intSonuc;
		// eğer tek işaret ise:
		if(int_random==0) {
			String sayi1,isaret1,sayi2,esittir,sonuc;
			int intSayi1,intSayi2;
			
			//iki veya üc basamaklı olasılığını eşitledim.
			int_random=rand.nextInt(upperbound);
			if(int_random==0) upperbound = 99;
			else upperbound = 999;
			//sayi1 için random değer:
			
			intSayi1 = rand.nextInt(upperbound);
			sayi1 = Integer.toString(intSayi1);
			//sayi2 için random değer:
			upperbound=99; //ikinci sayı daha küçük olursa daha anlaşılır bir denklem oluyor.
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
			//System.out.println(equation);
			
		}
		//çift işaret ise:
		else {
			
			String sayi1,isaret1,sayi2,isaret2,sayi3,esittir,sonuc;
			int intSayi1,intSayi2,intSayi3;

			upperbound=99;
			intSayi1 = rand.nextInt(upperbound);
			sayi1 = Integer.toString(intSayi1);
			//sayi2 için random değer:
			upperbound=10;
			intSayi2 = rand.nextInt(upperbound);
			sayi2 = Integer.toString(intSayi2);
			//sayi3 için random değer:
			upperbound=10;
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
				isaret1="*" ;
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
			intSonuc = twoSignsCalculate(intSayi1, isaret1, intSayi2, isaret2, intSayi3);
			sonuc = Integer.toString(intSonuc);
			equation = sayi1 + isaret1 + sayi2 + isaret2 + sayi3 + esittir + sonuc;
			//System.out.println(equation);
		}
		if(equation.length()<7 || equation.length()>9 || intSonuc<0) {
			generateEquation();
		}
		return equation;
	}

	public void printx() {
		System.out.println(equation.charAt(0)); //Stringde belirtilen yerdeki karakteri seçiyor
	}
	
	private int twoSignsCalculate(int sayi1,String i1,int sayi2,String i2,int sayi3) {
		int sonuc;
		if(i1=="+") {
			if(i2=="+") {
				sonuc = sayi1 + sayi2 + sayi3;
			}
			else if(i2=="-") {
				sonuc = sayi1 + sayi2 - sayi3;
			}
			else if(i2=="*") {
				sonuc = sayi1 + sayi2 * sayi3;
			}
			else {
				sonuc = sayi1 + sayi2 / sayi3;
			}
		}
		else if(i1=="-") {
			if(i2=="+") {
				sonuc = sayi1 - sayi2 + sayi3;
			}
			else if(i2=="-") {
				sonuc = sayi1 - sayi2 - sayi3;
			}
			else if(i2=="*") {
				sonuc = sayi1 - sayi2 * sayi3;
			}
			else {
				sonuc = sayi1 - sayi2 / sayi3;
			}
		}
		else if(i1=="*") {
			if(i2=="+") {
				sonuc = sayi1 * sayi2 + sayi3;
			}
			else if(i2=="-") {
				sonuc = sayi1 * sayi2 - sayi3;
			}
			else if(i2=="*") {
				sonuc = sayi1 * sayi2 * sayi3;
			}
			else {
				sonuc = sayi1 * sayi2 / sayi3;
			}
		}
		else {
			if(i2=="+") {
				sonuc = sayi1 / sayi2 + sayi3;
			}
			else if(i2=="-") {
				sonuc = sayi1 / sayi2 - sayi3;
			}
			else if(i2=="*") {
				sonuc = sayi1 / sayi2 * sayi3;
			}
			else {
				sonuc = sayi1 / sayi2 / sayi3;
			}
		}
		return sonuc;
	}
	
	public void start() {
		while(gameOn) {
			
			//oyun kısmı
			
		}
	}
}