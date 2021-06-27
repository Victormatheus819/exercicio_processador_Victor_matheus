package boleto;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fatura.Fatura;

public class BoletoTeste {

	private Boleto bol;
	private Date data;
	@BeforeEach
	public void inicializa() {
		data = new Date();
		bol = new Boleto(data,"14ju",180.50);
	}
	
	@DisplayName("Testa  getCodigo")
	@Test
	public void testGetNome() {
		String  cod = bol.getCodigo();		
		Assertions.assertEquals("14ju", cod);		
	}


	@DisplayName("Testa a getValorPago")
	@Test
	public void testGetValorTotal() {
		 double valor = bol.getValorPago();		
		Assertions.assertEquals(180.5, valor);		
	}	

	@DisplayName("Testa a getData")
	@Test
	public void testGetData() {
		 Date data = bol.getData();		
		Assertions.assertNotNull(data);		
	}
	
	
	
	@DisplayName("Testa a setValorTotal")
	@Test
	public void testSetValorTotal() {
		bol.setValorPago(200.5);
		double valor = bol.getValorPago();
		Assertions.assertEquals(200.5, valor);		
	}
	
	@DisplayName("Testa a setCodigo")
	@Test
	public void testSetSituacao() {
		bol.setCodigo("15kl");
		String situ = bol.getCodigo();
		Assertions.assertEquals("15kl", situ);		
	}

}
