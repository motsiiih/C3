package it.unicam.Team151.C3.puntoVendita;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.unicam.Team151.C3.utenti.Commerciante;

import javax.persistence.*;

/**
 * Classe che rappresenta un oggetto PuntoVendita
 */
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "id",
		scope = PuntoVendita.class)
@Entity
public class PuntoVendita {

	@Id
	@Column(name = "idPuntoVendita",unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name = "idCommerciante")
	private Commerciante commerciante;
	private String ubicazione;
	private String nome;

	public PuntoVendita(){
	}

	public PuntoVendita(Commerciante commerciante, String nome, String ubicazione) {
		this.nome = nome;
		this.commerciante = commerciante;
		this.ubicazione = ubicazione;
	}

	/**
	 * Metodo che restituisce l'id associato al punto vendita.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Metodo che restituisce l'id associato al commerciante.
	 */
	public Commerciante getCommerciante() {
		return commerciante;
	}

	/**
	 * Metodo che restituisce l'ubicazione associata al punto vendita.
	 */
	public String getUbicazione() {
		return ubicazione;
	}

	/**
	 * Metodo che restituisce il nome associato al punto vendita.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo che imposta il commerciante associato al punto vendita.
	 */
	public void setCommerciante(Commerciante commerciante) {
		this.commerciante = commerciante;
	}

	/**
	 * Metodo che imposta l'ubicazione associata al punto vendita.
	 */
	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}

	/**
	 * Metodo che imposta il nome associato al punto vendita.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}