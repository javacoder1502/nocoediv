/**
 * 
 */

function validateSearch() {
	var users_keyword = document.search_form.users_keyword.value;
	
	if (!users_keyword.replace(/\s/g, '').length) {
		alert("Please write something ");
		return false;
		// string only contained whitespace (ie. spaces, tabs or line breaks)
	}

}