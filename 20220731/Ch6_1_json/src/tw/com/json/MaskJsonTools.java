package tw.com.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.beans.Mask;
import tw.com.net.MaskNetTools;
import java.util.function.Consumer;
public class MaskJsonTools {
	
	
	public static void maskJsonToObj(String json,Consumer<List<Mask>> maskListCallBack) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map map = objectMapper.readValue(json, Map.class);
		List<Map<String,Object>> list = (List<Map<String, Object>>) map.get("features");
		List<Mask> maskList = new ArrayList<>();
		for(Map<String,Object> dataMap : list) {
			Map<String,Object> pMap = (Map<String,Object>)dataMap.get("properties");
			//System.out.println(pMap.get("id")+":"+pMap.get("name"));	
			Mask mask = new Mask();
			mask.setId(pMap.get("id").toString());
			mask.setName(pMap.get("name").toString());
			mask.setMaskAdult(pMap.get("mask_adult").toString());
			mask.setMaskChild(pMap.get("mask_child").toString());
			maskList.add(mask);
		}
		maskListCallBack.accept(maskList);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaskNetTools.getMaskJson(json->{
			try {
				maskJsonToObj(json,list->{
					System.out.println(list);					
				});
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

}
