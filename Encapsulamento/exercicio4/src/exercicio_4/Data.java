package exercicio_4;

public class Data {
	private int dd;
	private int mm;
	private String mes;
	private int aaaa;


	public Data (int d, int m, int a) {
		this.dd = d;
		this.mm = m;
		this.aaaa = a;
		
		switch (m) {
			
			case 1: {
				this.mes = "janeiro";
				break;
			}
			
			case 2: {
				this.mes = "fevereiro";
				break;
			}
			
			case 3: {
				this.mes = "março";
				break;
			}
			
			case 4: {
				this.mes = "abril";
				break;
			}
			
			case 5: {
				this.mes = "maio";
				break;
			}
			
			case 6: {
				this.mes = "junho";
				break;
			}
			
			case 7: {
				this.mes = "julho";
				break;
			}
			
			case 8: {
				this.mes = "agosto";
				break;
			}
			
			case 9: {
				this.mes = "setembro";
				break;
			}
			
			case 10: {
				this.mes = "outubro";
				break;
			}
			
			case 11: {
				this.mes = "novembro";
				break;
			}
			
			case 12: {
				this.mes = "dezembro";
				break;
			}
		}
		
	}

	public Data (int d, String m, int a) {
		this.dd = d;
		this.mes = m.toLowerCase();
		this.aaaa = a;
		
		
		switch (this.mes) {
		
			case "janeiro": {
				this.mm = 1;
				break;
			}
			
			case "fevereiro": {
				this.mm = 2;
				break;
			}
			
			case "março": {
				this.mm = 3;
				break;
			}
			
			case "abril": {
				this.mm = 4;
				break;
			}
			
			case "maio": {
				this.mm = 5;
				break;
			}
			
			case "junho": {
				this.mm = 6;
				break;
			}
			
			case "julho": {
				this.mm = 7;
				break;
			}
			
			case "agosto": {
				this.mm = 8;
				break;
			}
			
			case "setembro": {
				this.mm = 9;
				break;
			}
			
			case "outubro": {
				this.mm = 10;
				break;
			}
			
			case "novembro": {
				this.mm = 11;
				break;
			}
			
			case "dezembro": {
				this.mm = 12;
				break;
			}
		}
	}
	
	public void geraSaidaNumerica() {
		System.out.printf("%n%d/%d/%d", this.dd, this.mm, this.aaaa);
	}
	
	public void geraSaidaVerbal() {
		System.out.printf("%n%d/%s/%d", this.dd, this.mes, this.aaaa);
	}
}