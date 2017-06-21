package cn.test.service.impl;

import cn.test.dao.TestDao;
import cn.test.entity.Person;
import cn.test.service.TestService;

public class TestServiceImpl implements TestService {

	private TestDao testDao;

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public Person getPerson(Person person) throws Exception {
		return testDao.getPerson(person);
	}

}
