public class Fase {
		public void carregar(Runnable... metodos) {
	        for (Runnable metodo : metodos) {
	            metodo.run();
	        }
	    }
	}

