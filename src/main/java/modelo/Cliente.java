package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Boolean socio;

	public Cliente() {
	}

	public Cliente(Integer id, String nome, Boolean socio) {
		super();
		this.id = id;
		this.nome = nome;
		this.socio = socio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getSocio() {
		return socio;
	}

	public void setSocio(Boolean socio) {
		this.socio = socio;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", socio=" + socio + "]";
	}
}