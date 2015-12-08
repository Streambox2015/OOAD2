


public class Member {

	private String memberUserName;
	private String memberForeName;
	private String memberSurName;
	private String memberEmail;
	private String memberPassWord;
        
        Registration registration;
	
	
	
	
	
	public Member(String memberUserName,String memberForeName, String memberSurName, String memberEmail, String memberPassWord,Registration registration) {
		
		this.memberUserName = memberUserName;
                this.memberForeName = memberForeName;
                this.memberSurName = memberSurName;
                this.memberEmail = memberEmail;
		setMemberPassWord(memberPassWord);
                this.registration = registration;
		
		
		
		// TODO Auto-generated constructor stub
	}


	public String getMemberUserName() {
		return memberUserName;
	}


	public String getMemberForeName() {
		return memberForeName;
	}


	


	public String getMemberSurName() {
		return memberSurName;
	}
	
	

        
        public String getMemberEmail() {
		return memberEmail;
	}


	

	public String getMemberPassWord() {
		return memberPassWord;
	}


	public void setMemberPassWord(String memberPassWord) {
		this.memberPassWord = memberPassWord;
	}
	
	
	
	public String toString(){
		
            return "UserName...."+getMemberUserName()+"\nForeName...."+getMemberForeName()+"\nSurName...."+getMemberSurName()+"\nPassWord...."+getMemberPassWord()+"\nEmail...."+getMemberEmail()+"\n...."+registration;                        
	}

}
