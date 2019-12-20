package globalgame.common.datacache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globalgame.auto.json.Order_Json;
import com.globalgame.common.DataCache;
//升级数据
public class OrderDataCache extends DataCache<Order_Json>{
	//阶《》 
	private Map<Integer,Order_Json> map=new HashMap<>();
	/**
	 * 
	 * @param order 玩家的阶位
	 * @return 
	 */
	public Order_Json getByEquipLevel(int orderLevel){
		return map.get(orderLevel); 
	}
	 
	@Override
	protected void setDataCache(List<Order_Json> datas){ 
		Map<Integer,Order_Json> temp=new HashMap<>();
		for(Order_Json obj:datas){
			 temp.put(obj.getLevel(), obj);
		}
		this.map=temp;
	}

}
