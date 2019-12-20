package globalgame.common;

import java.util.HashMap;
import java.util.Map;
 

public class DataCacheManager {
	
	DataCacheManager() {
	}

	public final static DataCacheManager instance = new DataCacheManager();
	
	Map<Class<?>, DataCache<?>> ClassMappingCache = new HashMap<>(); 

	public synchronized <T> void putJSONDataCache( Class<T> clz,DataCache<T> cache){
		DataCache<?> cacheObj=ClassMappingCache.get(clz);
		if(cacheObj!=null) {
			DataCache<T> temp=(DataCache<T>) cacheObj;
			temp.setList(cache.getList());
		}
		ClassMappingCache.put(clz, cache);  
	}
    
	public <T> DataCache<T> getCache(Class<? extends T> clz) {
		DataCache<T> cache = (DataCache<T>) ClassMappingCache.get(clz);
		return cache;
	}
	
	
}
