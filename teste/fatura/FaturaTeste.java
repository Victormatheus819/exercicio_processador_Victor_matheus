package fatura;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import fatura.Fatura;
@DisplayName("Classe para teste da Fatura")
public class FaturaTeste {
	
	
		private Fatura fat;
		private Date data;
		@BeforeEach
		public void inicializa() {
			data = new Date();
			fat = new Fatura(data,"Ricardo",180.50 );
		}
		
		@DisplayName("Testa a getNome")
		@Test
		public void testGetNome() {
			String  name = fat.getNome();		
			Assertions.assertEquals("Ricardo", name);		
		}
	
	
		@DisplayName("Testa a getNome")
		@Test
		public void testGetValorTotal() {
			 double valor = fat.getValorTotal();		
			Assertions.assertEquals(180.5, valor);		
		}	
  
		@DisplayName("Testa a getNome")
		@Test
		public void testGetValorData() {
			 Date data = fat.getData();		
			Assertions.assertNotNull(data);		
		}
		
		@DisplayName("Testa a getNome")
		@Test
		public void testGetSituacao() {
			 String situ = fat.getSituacao();		
			Assertions.assertEquals("Pendente", situ);		
		}
		
		@DisplayName("Testa a setValorTotal")
		@Test
		public void testSetValorTotal() {
			fat.setValorTotal(200.5);
			double valor = fat.getValorTotal();
			Assertions.assertEquals(200.5, valor);		
		}
		
		@DisplayName("Testa a setValorTotal")
		@Test
		public void testSetNome() {
			fat.setNome("marco");
			String nome = fat.getNome();
			Assertions.assertEquals("marco", nome);		
		}
		
		@DisplayName("Testa a setValorTotal")
		@Test
		public void testSetSituacao() {
			fat.setNome("PAGA");
			String situ = fat.getNome();
			Assertions.assertEquals("PAGA", situ);		
		}
	}

		
		
		
	
