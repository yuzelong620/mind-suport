package globalgame.common.datacache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.globalgame.auto.json.ItemDrop_Json;
import com.globalgame.common.DataCache;

public class ItemDropDataCache extends DataCache<ItemDrop_Json>{
    HashMap<Integer, List<ItemDrop_Json>> map=new HashMap<>();
	@Override
	protected void setDataCache(List<ItemDrop_Json> datas) {
		 for (ItemDrop_Json json:datas) {
			List<ItemDrop_Json> list=map.get(json.getDropGruopID());
			if(list==null){
				list=new ArrayList<>();
				map.put(json.getDropGruopID(), list);
			}
			list.add(json);
		}
	}
	/** 
	 * @return
	 */
	public List<ItemDrop_Json> getItemDropsByGroupId(int itemGroupId){
		return map.get(itemGroupId);
	}

}
