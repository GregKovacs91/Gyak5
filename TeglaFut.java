
public class TeglaFut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teglalap A = new Teglalap(3, 8);
		Teglalap B = new Teglalap(3);
		Teglalap C = A;
		A.setoldal(4);
		System.out.println(A.Adatok());
		System.out.println(B.Adatok());
		System.out.println(A==B);
		System.out.println(A==C);
		System.out.println(A.Egyforma(B));
		}
	}