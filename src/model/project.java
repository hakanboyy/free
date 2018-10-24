package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@NamedQuery(name="selectAllProject",query="select p from project p")
public class project {
	@Id
	private int idProject;
	private int idCompany;
	private String name;
	private Date dateStart;
	private Date dateEnd;
	public int getIdProject() {
		return idProject;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
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
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
}
