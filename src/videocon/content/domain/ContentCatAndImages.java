package videocon.content.domain;

import java.util.ArrayList;
import java.util.List;

public class ContentCatAndImages {

	private String cat_name="";
	
	private List<String> ls = new ArrayList<String>();
	

	/**
	 * @return the ls
	 */
	public List<String> getLs() {
		return ls;
	}

	/**
	 * @param ls the ls to set
	 */
	public void setLs(List<String> ls) {
		this.ls = ls;
	}

	/**
	 * @return the cat_name
	 */
	public String getCat_name() {
		return cat_name;
	}

	/**
	 * @param cat_name the cat_name to set
	 */
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	
}
