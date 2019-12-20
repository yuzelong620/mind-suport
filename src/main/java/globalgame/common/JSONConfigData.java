package globalgame.common;

import java.util.List;

import com.globalgame.auto.json.*;
import com.globalgame.common.datacache.DropDataCache;
import com.globalgame.common.datacache.ItemDropDataCache;
import com.globalgame.common.datacache.OrderDataCache;
import com.globalgame.common.datacache.TaskDataCache;
import com.mind.core.util.JsonUtil;

/**
 * json 配置数据
 * 
 * @author Administrator
 *
 */
public class JSONConfigData {

	private static JSONConfigData instance = new JSONConfigData();

	public static JSONConfigData getInstance() {
		return instance;
	}

	public DataCache<GameParams_Json> getGameParams() {
		return gameParams;
	}

	/**
	 * 加载全部json数据
	 */
	public static synchronized void reloadAll() {
		JSONConfigData object = new JSONConfigData();
		object.init();
		instance = object;
	}

	private <T> void loadData(String jsonFile, Class<T> clz, DataCache<T> cache) {
		List<T> list = JsonUtil.parseJsonArray(jsonFile, clz);
		cache.setList(list);
		DataCacheManager.instance.putJSONDataCache(clz, cache);
	}

	final DataCache<GameParams_Json> gameParams = new DataCache<GameParams_Json>();

	public void init() {
		loadData("item.json", Item_Json.class, new DataCache<Item_Json>());
		loadData("equip.json", Equip_Json.class, new DataCache<Equip_Json>());
		loadData("drop.json", Drop_Json.class, new DropDataCache());
		loadData("GameParams.json", GameParams_Json.class, gameParams);
		loadData("ranking.json", Ranking_Json.class, new DataCache<Ranking_Json>());
		loadData("title.json", Title_Json.class, new DataCache<Title_Json>());

		loadData("draw.json", Draw_Json.class, new DataCache<Draw_Json>());
		loadData("itemDrop.json", ItemDrop_Json.class, new ItemDropDataCache());

		loadData("order.json", Order_Json.class, new OrderDataCache());
		loadData("task.json", Task_Json.class, new TaskDataCache());

		loadData("equipDLevelUp.json", EquipDLevelUp_Json.class, new DataCache<EquipDLevelUp_Json>());
		loadData("equipMake.json", EquipMake_Json.class, new DataCache<EquipMake_Json>());
		loadData("active.json", Active_Json.class, new DataCache<Active_Json>());
		loadData("stamina.json", Stamina_Json.class, new DataCache<Stamina_Json>());
		
	}

	public static void main(String[] args) {
		instance.init();
		List<Item_Json> items = DataCacheManager.instance.getCache(Item_Json.class).getList();
		System.out.println(items.size() + "个数字");

	}

}
