package com.acc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.acc.model.TShirtModel;

public class TShirtDao {
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public boolean validator(TShirtModel tShirt) {
		try {
			Session session = sf.openSession();
			TShirtModel lgdb = (TShirtModel) session.get(TShirtModel.class, tShirt.getColor());
			session.close();
			if (lgdb.getSize().equals(tShirt.getSize()) && lgdb.getGender().equals(tShirt.getGender())) {
				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
