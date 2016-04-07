package videocon.service.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services_details")
public class Services_details {
	
	@Column(name="sno")
	int sno;
	@Column(name="services_name")
	String services_name;
	@Column(name="keyword")
	String keyword;
	@Column(name="validity")
	String validity;
	@Column(name="pricepoint")
	String pricepoint;
	@Id
	@Column(name="service_id")
	String service_id;
	@Column(name="name")
	String name;
	@Column(name="action")
	String action;
	@Column(name="mt")
	String mt;
	@Column(name="content")
	String content;
	
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getServices_name() {
		return services_name;
	}
	public void setServices_name(String services_name) {
		this.services_name = services_name;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getPricepoint() {
		return pricepoint;
	}
	public void setPricepoint(String pricepoint) {
		this.pricepoint = pricepoint;
	}
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMt() {
		return mt;
	}
	public void setMt(String mt) {
		this.mt = mt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
