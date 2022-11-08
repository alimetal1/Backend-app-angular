package com.app.springboot.backend.apirest.models.entity;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "publicaciones")
public class Publicacion {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Cliente getUser() {
		return user;
	}

	public void setUser(Cliente user) {
		this.user = user;
	}

	    @NotNull(message="la región no puede ser vacia")
		@Column(columnDefinition="text", name="comentario")
	    private String content;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "clientes_id")
	    private Cliente user;

		@NotNull(message ="no puede estar vacio")
		@Column(name="create_at")
	    //private Date createAt = Date.from(Instant.now());

		public String createAt = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm:ss a").format(LocalDateTime.now());

		public String getCreateAt() {
			return createAt;
		}

		public void setCreateAt(String createAt) {
			this.createAt = createAt;
		}

		

	
}
