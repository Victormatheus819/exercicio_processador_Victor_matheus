package fatura;


import java.util.Date;

public class Fatura {
 private Date data;
   private double valorTotal;
   private String nome;
   private  String situacao;
  
  public Fatura (Date data, String nome, Double valorTotal ) {
		this.data = data; 
		this.nome = nome;
		this.valorTotal = valorTotal;
		this.situacao = "Pendente";
	}


 public void setValorTotal(double valor){
	 this.valorTotal = valor;
 }
 
 public void setNome(String nome){
	 this.nome = nome;
 }
 public void setData(Date data){
	 this.data = data;
 }
 
 public String getNome() {
	 return this.nome;
 }
 public Double  getValorTotal() {
	 return this.valorTotal;
 }
 public Date getData() {
	 return this.data;
 }
 public String getSituacao() {
	 return this.situacao;
 }
 public void setSituacao(String situacao){
	 this.situacao = situacao;
 }
 }