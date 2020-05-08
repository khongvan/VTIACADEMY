package Contructor;

import java.util.Date;

public class Group {
		int id;
		String name;
		Account	creator;
		Date createDate;
		Account [] participants;
		String[] userName;
		
		Group(){
		}
		
		Group(String name,Account creator, Account [] participants,Date createDate){
			this.name = name;
			this.creator= creator;
			this.participants=participants;
			this.createDate=createDate;
		}
		
		Group(String name, Account creator, String[] userName,Date createDate){
			this.name = name;
			this.creator= creator;
			this.createDate=createDate;
			this.userName=userName;
			
			for (int i =0; i< participants.length; i++) {
				Account a = new Account (userName[i]);
				a.userName=userName[i];
			}
		}
			
	}

