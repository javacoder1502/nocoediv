package videocon.content.domain;

public class ContentDes {
	private String content_type;
	private String content_name;
	private String content_prv;
	private String content_prv_path;

	public String getContent_prv_path() {
		return content_prv_path;
	}

	public void setContent_prv_path(String content_prv_path) {
		this.content_prv_path = content_prv_path;
	}

	public String getContent_prv() {
		return content_prv;
	}

	public void setContent_prv(String content_prv) {
		this.content_prv = content_prv;
	}

	public String getContent_name() {
		return content_name;
	}

	public void setContent_name(String content_name) {
		this.content_name = content_name;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

}
