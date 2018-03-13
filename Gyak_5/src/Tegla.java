import java.util.Scanner;
public class Tegla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teglalap[] T = new Teglalap[10];
		int AOldal, BOldal;
			for(int i=0; i<10; i++){
				AOldal = 2+(int)(Math.random()*9);
				BOldal = 2+(int)(Math.random()*9);
				T[i] = new Teglalap(AOldal, BOldal);
			}
		for(int i=0; i<10; i++) System.out.println(T[i].Adatok());
		int MaxIndex = 0;
		for(int i=1; i<10; i++){
		if (T[i].Terulet() > T[MaxIndex].Terulet()) MaxIndex = i;
		}
		System.out.println("Legnagyobb: "+T[MaxIndex].Adatok());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A oldal: ");
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		System.out.println("B oldal: ");
		s = sc.nextLine();
		int b = Integer.parseInt(s);
		Teglalap A = new Teglalap(a, b);
		for(int i=0; i<10; i++){
		if (A.NagyobbTeruletu(T[i]))
		System.out.println(T[i].Adatok());
		
		System.out.println("Megegyezõ téglalap:");
		
		boolean VanEgyezo = false;
		int j = 0;
		while (!VanEgyezo && i<9) {
		
			if (A.Egyforma(T[j])) {
					System.out.println(T[j].Adatok());
					VanEgyezo = true;
				}
			i++;
		}
		if (!VanEgyezo) System.out.println("Nincs egyezõ téglalap");
	}	
}
}