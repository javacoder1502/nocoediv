package videocon.content.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="waphit")
public class Waphit {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int sno;
	
	@Column(name="msisdn")
	String msisdn;
	
	@Column(name="zone")
	String zone;
	
	@Column(name="url_hit")
	String url_hit;
	
	@Column(name="profile")
	String profile;
	
	@Column(name="APN")
	String APN;
	


	@Column(name="ip")
	String ip;
	
	
	 public Waphit(){
		 
	 }
	public Waphit(String msisdn,String url_hit,String profile,String ip){
		this.msisdn=msisdn;
		this.url_hit=url_hit;
		this.profile=profile;
		this.APN=APN;
		this.ip=ip;
		
	}
	
	
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getUrl_hit() {
		return url_hit;
	}

	public void setUrl_hit(String url_hit) {
		this.url_hit = url_hit;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getAPN() {
		return APN;
	}

	public void setAPN(String aPN) {
		APN = aPN;
	}



	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	

	@Column(name="dateTime", nullable = false,
			 //columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
		columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP CURRENT_TIMESTAMP")
		private Date timestamp = new Date();
	
}
	
		
