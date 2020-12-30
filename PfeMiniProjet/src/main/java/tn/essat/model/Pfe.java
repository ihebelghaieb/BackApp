package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pfe {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	
	@ManyToOne
	@JoinColumn(name = "typepfe_id")
	@JsonIgnoreProperties("listP")
	private TypePfe typepfe;

	public Pfe(Integer id, String titre, TypePfe typepfe) {
		super();
		this.id = id;
		this.titre = titre;
		this.typepfe = typepfe;
	}

	public Pfe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public TypePfe getTypepfe() {
		return typepfe;
	}

	public void setTypepfe(TypePfe typepfe) {
		this.typepfe = typepfe;
	}
	
	
}
