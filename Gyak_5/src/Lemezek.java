import java.util.Scanner;
public class Lemezek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Lemezek Sz�ma: ");
		String s1 = sc.nextLine();
		int db = Integer.parseInt(s1);
		Hanglemez [] t = new Hanglemez[db+1];
		String s2, s3;
		int lh;
		for(int i=1; i<=db; i++){
			System.out.println(i+". el�ad�");
			s1 = sc.nextLine();
			System.out.println(i+". C�m: ");
			s2 = sc.nextLine();
			System.out.println(i+". lemez hossza percben: ");
			s3 = sc.nextLine();
			lh = Integer.parseInt(s3);
			t[i] = new Hanglemez(s1, s2, lh);
		}
		int MaxIndex = 1;
		for (int i=1; i<=db; i++){
			if (t[i].ellHossz(t[MaxIndex]) ==1) MaxIndex = i;
		}
		System.out.println(" A leghosszabb lemez ideje: "+t[MaxIndex].Adatok());
		
		System.out.println("El�ad�: ");
		s1 = sc.nextLine();
		for( int i=1; i<=db; i++){
			if (t[i].EllElado(s1)) System.out.println(t[i].Adatok());
		}
	}

}
