package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Anotações: alterar ou definir comportamentos
	
	@Entity // Definindo que a classe Postagem vai se tornar uma tabela
	@Table(name = "tb_postagens") //Definir o nome da tabela seguindo a nomeclatura
	public class Postagem {
		
		// id bigint PRIMARY LEY AUTO_INCREMENT
		
		@Id // Defini a chave primaria
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Defini que o campo é preenchido pelo banco de fomra incremental
		private Long id; //bigint
		
		// titulo varchar(100) NOT NULL | ["titulo"]
			
		@NotBlank(message = "O atributo título é obrigatório!")
		@Size(min = 5, max = 100, message = "O atributo título deve ter no minimo 5 e no máximo 100 caracteres.")
		private String titulo;
		
		// titulo varchar(100) NOT NULL | ["texto"]
		
		@NotBlank(message = "O atributo texto é obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo texto deve ter no minimo 10 e no máximo 1000 caracteres.")
		private String texto;
		
		@UpdateTimestamp // BD preenche esse cammpo e o utiliza
		private LocalDateTime data;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		} 
		
	}
