package cn.test.action;


import java.util.Map;

import cn.test.entity.Person;
import cn.test.service.TestService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction extends ActionSupport {
	private TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public TestService getTestService() {
		return testService;
	}
	
	private Person person; //表单提交

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String execute(){
		System.out.println("aaa");
		Person newPerson = null;
		Map<String, Object> session = ActionContext.getContext().getSession();
		try {
			newPerson = testService.getPerson(person);
			if (newPerson != null) {	
				//把用户信息存放在session上
				session.put("person", newPerson);
				return "succ";
			}
		} catch (Exception e) {
			//this.addActionError("获取信息失败，请重填");
			//e.printStackTrace();
			System.out.println(e.toString());
			return "input";
		}
		
		return "input";
		
	}
}
