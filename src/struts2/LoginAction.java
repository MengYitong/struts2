package struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String execute() throws Exception
	{
		if(getUsername().equals("m")&&getPassword().equals("m"))
		{
			ActionContext.getContext().getSession().put("user", getUsername());
			return "success";
		}
		else return "error";
	}
}
