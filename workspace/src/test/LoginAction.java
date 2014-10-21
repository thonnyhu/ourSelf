package test;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7134832462907569039L;
	@Override
	public String execute() throws Exception {
		System.out.println("aaaaaaaa");
		return "success";
	}
	public String testLogin(){
		
		System.out.println("aaaaaaaa");
		
		return "success";
	}
}
