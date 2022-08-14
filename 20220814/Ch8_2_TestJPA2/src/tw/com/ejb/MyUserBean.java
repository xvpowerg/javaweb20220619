package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;

//無狀態 不要建立屬性
@Stateless
public class MyUserBean implements MyUserBeanLocal {
	@Inject
	private EntityManager em;
	@Override
	public boolean login(MyUser myUser) {
		// TODO Auto-generated method stub
		MyUser tmpMyUser = 
				findUserByAccount(myUser.getAccount());
		if (tmpMyUser == null) return false;
 		return tmpMyUser.equals(myUser);
	}

	@Override
	public boolean regisrter(MyUser myUser) {
		// TODO Auto-generated method stub
		System.out.println("regisrter!!");
		try {
			em.persist(myUser);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);			
		}
		
		return false;
	}

	@Override
	public MyUser findUserByAccount(String account) {
		// TODO Auto-generated method stub
		MyUser myUser = null;
		TypedQuery<MyUser> query = em.createNamedQuery("findMyUser",MyUser.class);
		query.setParameter("account", account);
		try {
			myUser = query.getSingleResult();
			return myUser;
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		return null;
	}

	@Override
	public boolean deleteUser(MyUser myUser) {
		// TODO Auto-generated method stub
		try {
			//建立關聯性
			myUser  = em.merge(myUser);
			em.remove(myUser);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
	
		return false;
	}

}
