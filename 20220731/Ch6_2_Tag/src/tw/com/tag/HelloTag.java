package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag{
	private Tag parent;
	private PageContext pageContext;
	//��������
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out =   this.pageContext.getOut();
		try {
			out.println("<font size='5' color='blue'>�j�a�n�����}�F</font><br>");
		}catch(IOException ex) {
			
		}
		return EVAL_PAGE;
	}
	//�����_�l
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out = this.pageContext.getOut();
		try {
			out.println("<font size='5' color='blue'>�j�a�n�ڨӤF</font><br>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;//���槹�ثe�����٭n�����Ljsp���{��
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
	//�ثe��JSP
	@Override
	public void setPageContext(PageContext pageContext) {
		// TODO Auto-generated method stub
		this.pageContext = pageContext;
	}
	//���Ҫ��~��
	@Override
	public void setParent(Tag parent) {
		// TODO Auto-generated method stub
		this.parent = parent;
	}

}
