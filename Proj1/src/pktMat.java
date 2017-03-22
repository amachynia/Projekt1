
public class pktMat {
	private int m; //masa
	public pktMat(){ //konstruktor domyœlny
		m=1;
	}
	public pktMat(int a){ //konstruktor z parametrem
		if(a>0)
		{
			m=a;
		}else{
			System.out.println("Masa musi byc wieksza od zera");
		}
	}
	public int getMasa(){ //akcesor
		return m;
	}
	public int zmienMase(int c){ //zmiana masy
		m = c;
		return m;
	}
	public int momBez(){ //klasa obliczaj¹ca moment bezw³adnoœci
		int i=0;
		return i;
	}
	public int steiner(int d){ //klasa obliczaj¹ca moment bezw³adoœci z twierdzenia Steinera
		int is;
		
		is=momBez()+m*d*d;
		return is;
	}
	public void opis(){ //klasa zwracaj¹ca opis
		System.out.println("Punkt materialny");
	}
	
}
