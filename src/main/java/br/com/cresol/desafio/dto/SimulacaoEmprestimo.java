package br.com.cresol.desafio.dto;

import java.util.Date;

/**
 * @author evandro
 *
 */
public class SimulacaoEmprestimo {
	
	private String numeroDoContrato;
	private float valorDoContrato;
	private float valorDaParcela;
	private int quantidadeDeParcelas;
	private float taxaDeJuros;
	private Date dataDeValidade;
	private Date data;
	
	private String cpfDoCliente;
	
	public String getNumeroDoContrato() {
		return numeroDoContrato;
	}
	public void setNumeroDoContrato(String numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}
	public float getValorDoContrato() {
		return valorDoContrato;
	}
	public void setValorDoContrato(float valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
	}
	public float getValorDaParcela() {
		return valorDaParcela;
	}
	public void setValorDaParcela(float valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	public int getQuantidadeDeParcelas() {
		return quantidadeDeParcelas;
	}
	public void setQuantidadeDeParcelas(int quantidadeDeParcelas) {
		this.quantidadeDeParcelas = quantidadeDeParcelas;
	}
	public float getTaxaDeJuros() {
		return taxaDeJuros;
	}
	public void setTaxaDeJuros(float taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	public Date getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCpfDoCliente() {
		return cpfDoCliente;
	}
	public void setCpfDoCliente(String cpfDoCliente) {
		this.cpfDoCliente = cpfDoCliente;
	}
	
}
