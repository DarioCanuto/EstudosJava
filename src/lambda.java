import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambda {
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Dario",150);
		Usuario user2 = new Usuario("Thamires",200);
		Usuario user3 = new Usuario("Daniel",250);
		
		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		
//		usuarios.forEach(new Consumer<Usuario>(){
//			public void accept(Usuario u){			
//				System.out.println(u.getNome());
//			}
//		
//		});
		usuarios.forEach(u -> u.tornarModerador());
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
	
//	PAREI NO CAPITULO TRES 3
}

