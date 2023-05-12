
public class Mago extends Jogador {
	int mp = 100;
	
	public Mago(String nome) {
		super(nome);
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void mover(int x, int y) {
        System.out.println("Mago moveu para (" + x + ", " + y + ")");
    }
}
