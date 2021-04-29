package exercicio_4;

public class Principal {
	public static void main (String[] args) {
		
		Data data1 = new Data(14, 7, 1997);
		Data data2 = new Data(17, "junho", 1998);
		
		data1.geraSaidaNumerica();
		data1.geraSaidaVerbal();
		data2.geraSaidaNumerica();
		data2.geraSaidaVerbal();
	}
}
