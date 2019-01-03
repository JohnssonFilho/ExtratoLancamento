package br.com.gft.extrato.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "extrato")
public class TotalControleLancamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "quantidadeLancamentos", nullable = false)
	private int quantidadeLancamentos;
	
	@Column(name = "quantidadeRemessas", nullable = false)
	private int quantidadeRemessas;
	
	@Column(name = "valorLancamentos", nullable = false)
	private long valorLancamentos;
	
	@Column(name = "dataEfetivaLancamento", nullable = false)
	private String dataEfetivaLancamento;
	
	@Column(name = "dataLancamentoContaCorrenteCliente", nullable = false)
	private String dataLancamentoContaCorrenteCliente;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroEvento;
	
	@Column(name = "descricaoGrupoPagamento", nullable = false)
	private String descricaoGrupoPagamento;
	
	@Column(name = "codigoIdentificadorUnico", nullable = false)
	private int codigoIdentificadorUnico;
	
	@Column(name = "nomeBanco", nullable = false)
	private String nomeBanco;
	
	@Column(name = "quantidadeLancamentoRemessa", nullable = false)
	private int quantidadeLancamentoRemessa;
	
	@Column(name = "numeroRaizCNPJ", nullable = false)
	private String numeroRaizCNPJ;
	
	@Column(name = "numeroSufixoCNPJ", nullable = false)
	private String numeroSufixoCNPJ;
	
	@Column(name = "valorLancamentoRemessa", nullable = false)
	private long valorLancamentoRemessa;
	
	@Column(name = "dateLancamentoContaCorrenteCliente", nullable = false)
	private String dateLancamentoContaCorrenteCliente;
	
	@Column(name = "dateEfetivaLancamento", nullable = false)
	private String dateEfetivaLancamento;
	
	@Column(name = "numeroRemessaBanco", nullable = false)
	private long numeroRemessaBanco;
	
	@Column(name = "nomeSituacaoRemessa", nullable = false)
	private String nomeSituacaoRemessa;
	
	@Column(name = "codigoBanco", nullable = false)
	private int codigoBanco;
	
	@Column(name = "numeroAgencia", nullable = false)
	private int numeroAgencia;
	
	@Column(name = "numeroContaCorrente", nullable = false)
	private long numeroContaCorrente;
	
	@Column(name = "nomeTipoOperacao", nullable = false)
	private String nomeTipoOperacao;
	
	public TotalControleLancamento() {

	}

	public TotalControleLancamento(int quantidadeLancamentos, int quantidadeRemessas, long valorLancamentos,
			String dataEfetivaLancamento, String dataLancamentoContaCorrenteCliente, long numeroEvento,
			String descricaoGrupoPagamento, int codigoIdentificadorUnico, String nomeBanco,
			int quantidadeLancamentoRemessa, String numeroRaizCNPJ, String numeroSufixoCNPJ,
			long valorLancamentoRemessa, String dateLancamentoContaCorrenteCliente, String dateEfetivaLancamento,
			long numeroRemessaBanco, String nomeSituacaoRemessa, int codigoBanco, int numeroAgencia,
			long numeroContaCorrente, String nomeTipoOperacao) {

		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	public long getNumeroEvento() {
		return numeroEvento;
	}
	public void setNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	public int getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	public long getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	public void setValorLancamentoRemessa(long valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	public String getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}
	public void setDateLancamentoContaCorrenteCliente(String dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	public String getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	public void setDateEfetivaLancamento(String dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public int getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public long getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(long numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public long getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(long valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

	@Override
	public String toString() {
		return "TotalControleLancamento [quantidadeLancamentos=" + quantidadeLancamentos + ", quantidadeRemessas="
				+ quantidadeRemessas + ", valorLancamentos=" + valorLancamentos + ", dataEfetivaLancamento="
				+ dataEfetivaLancamento + ", dataLancamentoContaCorrenteCliente=" + dataLancamentoContaCorrenteCliente
				+ ", numeroEvento=" + numeroEvento + ", descricaoGrupoPagamento=" + descricaoGrupoPagamento
				+ ", codigoIdentificadorUnico=" + codigoIdentificadorUnico + ", nomeBanco=" + nomeBanco
				+ ", quantidadeLancamentoRemessa=" + quantidadeLancamentoRemessa + ", numeroRaizCNPJ=" + numeroRaizCNPJ
				+ ", numeroSufixoCNPJ=" + numeroSufixoCNPJ + ", valorLancamentoRemessa=" + valorLancamentoRemessa
				+ ", dateLancamentoContaCorrenteCliente=" + dateLancamentoContaCorrenteCliente
				+ ", dateEfetivaLancamento=" + dateEfetivaLancamento + ", numeroRemessaBanco=" + numeroRemessaBanco
				+ ", nomeSituacaoRemessa=" + nomeSituacaoRemessa + ", codigoBanco=" + codigoBanco + ", numeroAgencia="
				+ numeroAgencia + ", numeroContaCorrente=" + numeroContaCorrente + ", nomeTipoOperacao="
				+ nomeTipoOperacao + "]";
	}
	
}
