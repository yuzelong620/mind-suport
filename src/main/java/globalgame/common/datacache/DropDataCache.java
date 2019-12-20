package globalgame.common.datacache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.globalgame.auto.json.Drop_Json;
import com.globalgame.common.DataCache;
import com.mind.core.util.IntTuple;

public class DropDataCache extends DataCache<Drop_Json>{
    HashMap<Integer,List<Drop_Json>>map=new HashMap<>();
	@Override
	protected void setDataCache(List<Drop_Json> datas) {
		for(Drop_Json json:datas){
			List<Drop_Json> list=map.get(json.getGroupID());
			if(list==null){
				list=new ArrayList<>();
				map.put(json.getGroupID(),list);
			}
			list.add(json);
		}
	}
	
	public List<IntTuple> getDrops(int playerLevel,int groupId){
		List<Drop_Json> list=map.get(groupId);
		List<IntTuple> result=new ArrayList<>();
		for(Drop_Json json:list){
			if(playerLevel>=json.getMinLevel()&&playerLevel<=json.getMaxLevel()){
				result.addAll(json.getDropList());
			}
		}
		return result;
	}
}
