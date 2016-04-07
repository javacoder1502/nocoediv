package videocon.content.helperui;

import org.springframework.stereotype.Component;

@Component
public class CatDropDown {

	String selectedCat="";

	public String getSelectedCat() {
		return selectedCat;
	}

	public void setSelectedCat(String selectedCat) {
		this.selectedCat = selectedCat;
	}
	
	
}
