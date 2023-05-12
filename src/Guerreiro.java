
public class Guerreiro extends Jogador {
	private boolean furia;
	
	public Guerreiro(String nome) {
		super(nome);
	}

	
	public boolean isFuria() {
		return furia;
	}


	public void setFuria(boolean furia) {
		this.furia = furia;
	}

	public void furyMode(Guerreiro guerreiro){
		if (guerreiro.getHp() == 50){
			this.furia = true;
		}else {
			this.furia = false;
		}
	}
	
	public void mover(int x, int y) {
        System.out.println("Guerreiro moveu para (" + x + ", " + y + ")");
    }
}
