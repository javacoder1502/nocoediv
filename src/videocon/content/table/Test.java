package videocon.content.table;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import videocon.content.utility.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		 
		
		Criteria crit = session.createCriteria(Content.class);
		System.out.println("after crit--");
		List<Content> results = crit.list();
		System.out.println("after result--");
		System.out.println("after length--"+results.size());
		Iterator<Content> ite = results.iterator();
		System.out.println("iteeeeee--");
		while(ite.hasNext()){
			System.out.println("in while");
			Content g = ite.next();
			System.out.println(g.getName());
		}
		
	}
}
