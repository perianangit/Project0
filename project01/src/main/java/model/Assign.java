package model;

public class Assign {
	public String name;
	public String userAdmin;
	public String userMobileNumber;
	public int userAge;
	public int userYearOfStudy;
	public float userMark;
	public String userEmail;
	public String userPassword;
	public String userAdmissionStatus;
	public String userBranch;
	public Assign(String name,String userAdmin,String userMobileNumber,int userAge,int userYearOfStudy,float userMark,String userEmail,String userPassword, String userAdmissionStatus, String userBranch)
	{
		this.name=name;
		this.userAdmin=userAdmin;
		this.userMobileNumber=userMobileNumber;
		this.userAge=userAge;
		this.userYearOfStudy=userYearOfStudy;
		this.userMark=userMark;
		this.userEmail=userEmail;
		this.userPassword=userPassword;
		this.userAdmissionStatus=userAdmissionStatus;
		this.userBranch=userBranch;
	}
}
