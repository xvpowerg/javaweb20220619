package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag{
	private Tag parent;
	private PageContext pageContext;
	//結尾標籤
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out =   this.pageContext.getOut();
		try {
			out.println("<font size='5' color='blue'>大家好我離開了</font><br>");
		}catch(IOException ex) {
			
		}
		return EVAL_PAGE;
	}
	//結尾起始
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out = this.pageContext.getOut();
		try {
			out.println("<font size='5' color='blue'>大家好我來了</font><br>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;//執行完目前標籤還要執行其他jsp的程式
	}
	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}
	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}
	//目前的JSP
	@Override
	public void setPageContext(PageContext pageContext) {
		// TODO Auto-generated method stub
		this.pageContext = pageContext;
	}
	//標籤的外部
	@Override
	public void setParent(Tag parent) {
		// TODO Auto-generated method stub
		this.parent = parent;
	}

}
