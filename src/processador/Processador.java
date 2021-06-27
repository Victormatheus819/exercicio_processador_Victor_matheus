package processador;

import java.util.ArrayList;

import boleto.Boleto;
import pagamento.Pagamento;

public class Processador {
	 private ArrayList <Pagamento> listpag;
		public void ProcessaBoletos(ArrayList<Boleto> list) {
			listpag = new ArrayList<Pagamento>();
			for(Boleto bol : list) {
			    Pagamento pag = new Pagamento();
				pag.setValorPago(bol.getValorPago());
				pag.setTipo("boleto");
				 listpag.add(pag);
			}
		}
		public ArrayList <Pagamento> getList() {
			return listpag;
		}
		public void setList(ArrayList <Pagamento> list) {
			this.listpag = list;
		}
}
