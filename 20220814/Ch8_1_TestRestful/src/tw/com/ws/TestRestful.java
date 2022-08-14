package tw.com.ws;


import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)//�^��json�榡
public class TestRestful {
	//GET �ΨӰ��d�� ���|�׸Ӹ��
		//POST �Ψӷs�W���
		//PATCH �i�Ψӭק���
		//DELETE �ΨӧR�����
//	@GET
//	public String testHello() {
//		return "{\"value\":\"Hello\"}";		
//	}
//	
//	@POST
//	@Path("test_post")
//	public String testPost(@FormParam("name") String name,@FormParam("pass") String pass) {		
//		
//		return "{\"name\":\""+name+"\",\"value\":"+pass+"}";
//		
//	}
//	
//	@DELETE
//	public String delete(@QueryParam("id") Long id) {
//		
//		return "{\"id\":"+id+"}";
//	}
	// /id/abc123
	@GET
	@Path("/id/{myId:\\S+}")
	public String createDate(@PathParam("myId") String id) {
		return "{\"id\":\""+id+ "\"}";
	}
	
	@PATCH
	public String update(@QueryParam("id") Long id,
			@DefaultValue("empty")  @QueryParam("name") String name,
			@DefaultValue("-1") @QueryParam("age") int age) {
			
		String json = 
				String.format("{\"id\":%d,\"name\":\"%s\",\"age\":%d}", id,name,age);
		
		return json;
	}
	
}
