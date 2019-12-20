package globalgame.common;

import java.util.List;

import com.globalgame.auto.json.GameParams_Json;

public class GameParamCache extends DataCache<GameParams_Json> {

	private GameParams_Json params;

	@Override
	protected void setDataCache(List<GameParams_Json> datas) {
		params = datas.get(0);// index=0
	}

	public GameParams_Json getInstance() {
		return params;
	}

}
