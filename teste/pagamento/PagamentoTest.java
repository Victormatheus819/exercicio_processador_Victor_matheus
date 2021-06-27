package pagamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Classe para teste Pagamento")
public class PagamentoTest {
	
	
	@DisplayName("Classe para insercao de conteudo em pagamento")
	@Test
	public void Insecao ConteudoemPagamento() {
		Pagamento pag= new Pagamento ();
		pag.setTipo("Boleto");
		pag.setValorPago(150.6);
		Assertions.assertAll("pag",
				() -> assertEquals("Boleto", pag.getTipo()),
				() -> assertEquals(150.6, pag.getValorPago()),
				( )-> assertTrue(pag.getData() != null)
				);
	}
	
}
