package pagamento;

import java.util.Date;

public class Pagamento {
	private String tipo;
	private double valorPago;
	private Date data;

public Pagamento () {
	this.data = new Date();
}		

	
 public String getTipo() {
	 return this.tipo;
 }
 public double getValorPago() {
	 return  this.valorPago;
 }
 
 public Date getData() {
	 return new Date() ;
 }
 
 public void setTipo(String tipo) {
	 this.tipo = tipo;
 }

public void setValorPago(double valorPago) {
	this.valorPago = valorPago;
}

public void setData(Date data) {
	this.data = data;
}
}
