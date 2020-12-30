package tn.essat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class TypePfe {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "typepfe")
	
    private List<Pfe> listP;
	
	public TypePfe() {
		this.listP = new ArrayList<Pfe>();
	}
	
	public TypePfe(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
		this.listP = new ArrayList<Pfe>();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Pfe> getListP() {
		return listP;
	}
	public void setListP(List<Pfe> listP) {
		this.listP = listP;
	}
	public void addpfe(Pfe li) {
		this.listP.add(li);
		
	}
	
	
}
