package exercicio_1;

public class Carro {
	private String modelo;
	private String placa;
	private String descricaoDeDefeitoParaConserto;
	private String dataDeValidadeDaVistoria;
	private String nomeDoProprietario;
	private String dataDeDevolucaoDoCarro;
	private float precoAVista;
	private float precoEntrada;
	private float precoParecela;
	private float precoDoConserto;
	private float precoDoAluguelPorDia;
	private float precoDaVistoria;
	private int nDeParcelas;
	private int diasDeAluguel;
	
	
	public void alugarCarro (String modelo, String placa, String nomeDoProprietario, String dataDeDevolucaoDoCarro, float precoDoAluguelPorDia, int diasDeAluguel) {		
	}
	
	public void enviarParaOConserto (String modelo, String placa, String descricaoDeDefeitoParaConserto, String dataDeDevolucaoDoCarro, float precoDoConserto) {
	}
	
	public void enviarParaODETRAN (String modelo, String placa, String nomeDoProprietario, String dataDeValidadeDaVistoria, float precoDaVistoria) {
	}
	
	public void venderCarroAVista (String modelo, String placa, String nomeDoProprietario, String dataDeValidadeDaVistoria, float precoAVista) {
	}
	
	public void venderCarroParcelado (String modelo, String placa, String nomeDoProprietario, String dataDeValidadeDaVistoria, float precoDaEntrada, float precoParcela, int nDeParcelas) {		
	}
	
}
