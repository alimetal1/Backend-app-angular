package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.time.Instant;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


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
	    private Instant createAt;

		public Instant getCreateAt() {
			return createAt;
		}

		public void setCreateAt(Instant createAt) {
			this.createAt = createAt;
		}

}
