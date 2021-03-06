package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss") 
		@Column(name = "data_hora")
		private LocalDateTime dataHora;
		private String descricao;
		private Double valor;
		
		@Column(name = "id_conta")
		private Integer idConta;
		
		/*Salva o valor literal de determinada coluna na classe MovimentaçãoTipo.*/
		@Enumerated
		private MovimentacaoTipo tipo;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public LocalDateTime getDataHora() {
			return dataHora;
		}

		public void setDataHora(LocalDateTime dataHora) {
			this.dataHora = dataHora;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public Integer getIdConta() {
			return idConta;
		}

		public void setIdConta(Integer idConta) {
			this.idConta = idConta;
		}

		public MovimentacaoTipo getTipo() {
			return tipo;
		}

		public void setTipo(MovimentacaoTipo tipo) {
			this.tipo = tipo;
		}
		
}
