package processador;

import java.util.ArrayList;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class Processador {
	 private ArrayList <Pagamento> listpag;
	 private Fatura fatura;
		public void ProcessaBoletos(ArrayList<Boleto> list) {
			listpag = new ArrayList<Pagamento>();
			for(Boleto bol : list) {
			    Pagamento pag = new Pagamento();
				pag.setValorPago(bol.getValorPago());
				fatura.setValorTotal(fatura.getValorTotal()- bol.getValorPago());
				pag.setTipo("boleto");
				 if(fatura.getValorTotal()<= 0) {
				  fatura.setSituacao("PAGA");
				 }
				 listpag.add(pag);
			}
		}
		public ArrayList <Pagamento> getList() {
			return listpag;
		}
		public void setList(ArrayList <Pagamento> list) {
			this.listpag = list;
		}
		public Fatura getFatura() {
			return fatura;
		}
		public void setFatura(Fatura fatura) {
			this.fatura = fatura;
		}
}