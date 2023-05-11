
public class Fase {
	
	public void carregar(Object... objetos) {
        for (Object objeto : objetos) {
            System.out.println("Classe carregada: " + objeto.getClass().getSimpleName());
        }
    }
}
