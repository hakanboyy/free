package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="selectAllCompany",query="select c from company c")
public class company {
	@Id
	private int idCompany;
	private String name;
	public int getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
