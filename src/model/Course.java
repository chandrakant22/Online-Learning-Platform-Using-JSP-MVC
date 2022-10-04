package model;

public class Course {
	
	
	private int cid;
	private String  coursetitle, instructor, category, totalenroll, fees, imgurl;
	

	public Course() {
		super();
	}
	
	
	public Course(String coursetitle, String instructor, String category, String totalenroll, String fees,
			String imgurl) {
		super();
		this.coursetitle = coursetitle;
		this.instructor = instructor;
		this.category = category;
		this.totalenroll = totalenroll;
		this.fees = fees;
		this.imgurl = imgurl;
	}
	public Course(int cid, String coursetitle, String instructor, String category, String totalenroll, String fees,
			String imgurl) {
		super();
		this.cid = cid;
		this.coursetitle = coursetitle;
		this.instructor = instructor;
		this.category = category;
		this.totalenroll = totalenroll;
		this.fees = fees;
		this.imgurl = imgurl;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCoursetitle() {
		return coursetitle;
	}
	public void setCoursetitle(String coursetitle) {
		this.coursetitle = coursetitle;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTotalenroll() {
		return totalenroll;
	}
	public void setTotalenroll(String totalenroll) {
		this.totalenroll = totalenroll;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
	
	
	
	
	
}
