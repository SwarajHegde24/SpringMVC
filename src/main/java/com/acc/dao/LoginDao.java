package com.acc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.acc.model.LoginModel;
import com.acc.model.TShirtModel;

public class LoginDao {
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
	  public boolean validator(LoginModel login) { try { Session session =
	  sf.openSession(); LoginModel lgdb = (LoginModel)
	  session.get(LoginModel.class, login.getUserName()); session.close(); if
	  (lgdb.getPassword().equals(login.getPassword())) { return true; } else {
	  return false;
	  
	  }
	  
	  } catch (Exception e) { e.printStackTrace(); return false; } }
}
