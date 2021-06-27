package boleto;

import java.util.Date;

public class Boleto {
	
	   private Date data;
	   private double valorPago;
	   private String codigo;
	  
	  
	  public Boleto (Date data,String codigo,Double valorPago) {
			this.data = data; 
			this.codigo= codigo;
			this.valorPago = valorPago;
		}
	 public void setValorPago(double valor){
		 this.valorPago = valor;
	 }
	 
	 public void setData(Date data){
		 this.data = data;
	 }
	 public void setCodigo(String codigo){
		 this.codigo = codigo;
	 }
	 public Double  getValorPago() {
		 return this.valorPago;
	 }
	 public Date getData() {
		 return this.data;
	 }
	 public String getCodigo() {
		 return this.codigo;
	 }
	
}

