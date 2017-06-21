package cn.test.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.test.dao.TestDao;
import cn.test.entity.Person;

public class TestDaoImpl extends HibernateDaoSupport implements TestDao{

	public Person getPerson(Person person) {
		System.out.println("bbb");
		//String hql = "from Person p where p.personno=?";
		//List<Person> list = getHibernateTemplate().find(hql,new Object[] { person.getPersonno()});
		//return list.get(0);
		String hql = "from Person p where p.personno='"+person.getPersonno()+"'";
		return (Person) getHibernateTemplate().find(hql).get(0);
	}

}
