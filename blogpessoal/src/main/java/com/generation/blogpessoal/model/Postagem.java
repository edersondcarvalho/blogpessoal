package com.generation.blogpessoal.model;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;






@Entity
@Table(name = "tb_postagens")



public class Postagem {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
	
      
    @NotBlank(message = "O atributo Titulo e Obrigatorio e nao pode ser vazio")
    @Size(min = 5, max = 100, message = "O Atributo titulo deve contar no min 5 e na max 100 caracteres")
    private String titulo; 
	
    @NotNull(message = "O atributo Texto e Obrigatorio")  
    @Size(min = 10, max = 1000, message = "O Atributo text deve contar no min 10 e na max 1000 caracteres")
	private String texto;
	
    @UpdateTimestamp
	private LocalDateTime  data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
