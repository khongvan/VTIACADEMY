package com.vti.entity;

import java.util.Date;

public class Group {
		private int id;
		private String name;
		private Account	creator;
		private Date createDate;
		private Account [] participants;
		private String[] userName;
		
		Group(){
		}
		
		public Group(String name,Account creator, Account [] participants,Date createDate){
			this.name = name;
			this.creator= creator;
			this.participants=participants;
			this.createDate=createDate;
		}
		
		public Group(String name, Account creator, String[] userName,Date createDate){
			this.name = name;
			this.creator= creator;
			this.createDate=createDate;
			this.userName=userName;
			
			for (int i =0; i< participants.length; i++) {
				Account a = new Account (userName[i]);
				a.userName=userName[i];
			}
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Account getCreator() {
			return creator;
		}

		public void setCreator(Account creator) {
			this.creator = creator;
		}

		public Date getCreateDate() {
			return createDate;
		}

		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}

		public Account[] getParticipants() {
			return participants;
		}

		public void setParticipants(Account[] participants) {
			this.participants = participants;
		}

		public String[] getUserName() {
			return userName;
		}

		public void setUserName(String[] userName) {
			this.userName = userName;
		}
		
			
	}

