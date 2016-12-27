package model;

public class Data {
	private String pathLink;
	private String subName;
	
	public Data(){
		
	}
	
	public Data(String pathLink,String subName){
		this.pathLink = pathLink;
		this.subName = subName;
	}
	
	public Data(String pathLink){
		this.pathLink = pathLink;
	}

	public String getPathLink() {
		return pathLink;
	}

	public void setPathLink(String pathLink) {
		this.pathLink = pathLink;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	
}
