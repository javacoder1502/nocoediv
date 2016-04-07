package videocon.content.table;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Content {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int code;
	@Column(name="name")
	String name;
	@Column(name="prv")
	String prv;
	@Column(name="src_type")
	String src_type;
	@Column(name="src_stream")
	String src_stream;
	@Column(name="cat")
	String cat;
	@Column(name="pricetag")
	String pricetag;
	@Column(name="cat_type")
	String cat_type;
	

	@Column(name="timestamp", nullable = false,
		 //columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP CURRENT_TIMESTAMP")
	private Date timestamp = new Date();
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrv() {
		return prv;
	}
	public void setPrv(String prv) {
		this.prv = prv;
	}
	public String getSrc_type() {
		return src_type;
	}
	public void setSrc_type(String src_type) {
		this.src_type = src_type;
	}
	public String getSrc_stream() {
		return src_stream;
	}
	public void setSrc_stream(String src_stream) {
		this.src_stream = src_stream;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getPricetag() {
		return pricetag;
	}
	public void setPricetag(String pricetag) {
		this.pricetag = pricetag;
	}
	public String getCat_type() {
		return cat_type;
	}
	public void setCat_type(String cat_type) {
		this.cat_type = cat_type;
	}
	

	
}



