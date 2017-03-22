
public class kl1 {
	
	
	
	public static void main(String[] args) {
        pktMat pktA = new pktMat(); //Stworzenie nowego obiektu klasy z u¿yciem konstruktora domyœlnego.
        pktMat pktB = new pktMat(10); //Stworzenie drugiego obiektu klasy z u¿yciem konstruktora z parametrami.
        
        //Wyœwietlenie
        pktA.opis();
        System.out.println("Masa: "+ pktA.getMasa() + ". Glowny moment bezwladnosci " + pktA.momBez() + ". Moment wzgledem nowej osi " + pktA.steiner(2) + ".");
        pktB.opis();
        System.out.println("Masa: "+ pktB.getMasa() + ". Glowny moment bezwladnosci " + pktB.momBez() + ". Moment wzgledem nowej osi " + pktB.steiner(2) + ".");
        
        //Zmiana masy
        pktA.opis();
        pktA.zmienMase(100);
        System.out.println("Masa: "+ pktA.getMasa() + ". Glowny moment bezwladnosci " + pktA.momBez() + ". Moment wzgledem nowej osi " + pktA.steiner(2) + ".");
        
        //Tablica punktów
        pktMat[] tab = new pktMat[10];
        for (int i=0; i<10; i++){
        	pktMat pkt = new pktMat(i+1);
        	tab[i]=pkt;
        }
        
        //Wyœwietlenie tablicy
        for(pktMat p : tab){
            p.opis();
            System.out.println("Masa: "+ p.getMasa() + ". Glowny moment bezwladnosci " + p.momBez() + ". Moment wzgledem nowej osi " + p.steiner(2) + ".");

        }
	}
}
