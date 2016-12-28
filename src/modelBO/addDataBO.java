package modelBO;

import modelDAO.addDataDAO;

public class addDataBO {
	public boolean addData(String link,String fileName){
		return new addDataDAO().addData(link, fileName);
	}
}
