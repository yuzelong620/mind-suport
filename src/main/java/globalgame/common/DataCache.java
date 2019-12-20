package globalgame.common;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globalgame.auto.json.GameParams_Json;
 
/**
 * json data cache
 * @author zxd
 *
 * @param <E>
 */
public class DataCache<E>{
	
	public DataCache( ) { 
		 
	}
	Class<?extends E> EntityClass;
	List<E> list;
	Map<Integer,E> map;
	
	public void setList(List<E> datas) {
		if(datas==null) {
		   return;	
		}
		list=datas;
		Map<Integer,E> dataMap=new HashMap<>();
		for(E obj:datas) {
			if(obj.getClass()==GameParams_Json.class){
			    continue;
			}
			try {
				int id=(Integer) obj.getClass().getMethod("getId", null).invoke(obj);
				dataMap.put(id, obj);
			} catch (Exception e) { 
			  throw new RuntimeException("not find: getId() mothed. class:  "+obj.getClass());
			}
		}
		this.map=dataMap; 
		setDataCache(datas);
	}
	/**实现自己的缓存，请实现此方法*/
	protected void setDataCache(List<E> datas) {
		
	}
    
	public List<E> getList( ) {
		return list;
	}
    
	public  E  getData(int id) {
		return map.get(id);
	}
  
} 
