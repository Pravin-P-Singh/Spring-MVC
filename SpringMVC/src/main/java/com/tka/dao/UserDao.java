package com.tka.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean loginUser(User user) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(User.class);
			SimpleExpression username = Restrictions.eq("username", user.getUsername());
			SimpleExpression password = Restrictions.eq("password", user.getPassword());
			criteria.add(Restrictions.and(username,password));
			User dbUser = (User) criteria.uniqueResult();
			if(dbUser!=null) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
	}
}
