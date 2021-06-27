package processador;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import boleto.Boleto;
import fatura.Fatura;

public class ProcessadorTeste {

	@Test
	public void GeraPagamento() {
		
		 Boleto bol1 = new Boleto(new Date(),"16ji",80.0);
		 Boleto bol2 = new Boleto(new Date(),"17lo",90.0);
		 ArrayList <Boleto> list = new ArrayList<Boleto>();
		 list.add(bol1);
		 list.add(bol2);
		 Processador processador = new Processador();
		 processador.ProcessaBoletos(list);
		 int numeroBoletos= processador.getList().size();
		Assert.assertEquals(numeroBoletos, 2);
	}
	
	@Test 
	public void TestaAssociacaoFatura() {
		 Fatura fat = new Fatura (new Date(),"carlos",170.0);
		 Processador processador   = new Processador();
		 
		 processador.setFatura(fat);
		 
		 Assert.assertEquals(fat,processador.getFatura());
		 
	}
	
}
