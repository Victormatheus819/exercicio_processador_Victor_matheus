package processador;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorTeste {

	@Test
	public void GeraPagamento() {
		Fatura fat = new Fatura (new Date(),"carlos",170.0);
		 Boleto bol1 = new Boleto(new Date(),"16ji",80.0);
		 Boleto bol2 = new Boleto(new Date(),"17lo",90.0);
		 ArrayList <Boleto> list = new ArrayList<Boleto>();
		 
		 list.add(bol1);
		 list.add(bol2);
		 Processador processador = new Processador();
		 processador.setFatura(fat);
		 processador.ProcessaBoletos(list);
		 int numeroBoletos= processador.getList().size();
		Assert.assertEquals(numeroBoletos, 2);
	}
	
	@Test 
	public void TestaAssociacaoFatura() {
		 Fatura fat = new Fatura (new Date(),"carlos",170.0);
		 Processador processador = new Processador();
		 processador.setFatura(fat);
		 Assert.assertEquals(fat,processador.getFatura());
		 
	}
	
	@Test 
	public void TestaDebitoDeFatura() {
		 Fatura fat = new Fatura (new Date(),"carlos",170.0);
		 Boleto bol1 = new Boleto(new Date(),"16ji",80.0);
		 Boleto bol2 = new Boleto(new Date(),"17lo",90.0);
		 ArrayList <Boleto> list = new ArrayList<Boleto>();
		 Processador processador = new Processador();
		 list.add(bol1);
		 list.add(bol2);
		 processador.setFatura(fat);
		 processador.ProcessaBoletos(list);
		 System.out.println(processador.getFatura().getValorTotal());
		 ArrayList<Pagamento> tipo = processador.getList();
		 Assert.assertEquals("PAGA",fat.getSituacao());
		 Assert.assertEquals("boleto",tipo.get(0).getTipo());
	}
	
}
