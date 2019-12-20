package globalgame.auto.json;
import java.util.List;
import com.mind.core.util.StringIntTuple;
import com.mind.core.util.IntDoubleTuple;
import com.mind.core.util.IntTuple;
import com.mind.core.util.ThreeTuple;
import com.mind.core.util.StringFloatTuple;

/**
*自动生成类
*/
public class GameParams_Json{
	/** 回收材料获得碎片数量与购买价格的比值::*/
	private Double	material_sale_piece_percent;
	/** 材料背包的格子总数::*/
	private Integer	bag_item_count;
	/** 恢复体力时长：分钟::*/
	private Integer	regain_stamina_time_long;
	/** 体力上限::*/
	private Integer	max_stamina;
	/** 剧本产出金钱的比例（对比经验）::*/
	private Double	give_money_by_times;

	/** 回收材料获得碎片数量与购买价格的比值::*/
	public Double getMaterial_sale_piece_percent(){
		return this.material_sale_piece_percent;
	}
	/** 材料背包的格子总数::*/
	public Integer getBag_item_count(){
		return this.bag_item_count;
	}
	/** 恢复体力时长：分钟::*/
	public Integer getRegain_stamina_time_long(){
		return this.regain_stamina_time_long;
	}
	/** 体力上限::*/
	public Integer getMax_stamina(){
		return this.max_stamina;
	}
	/** 剧本产出金钱的比例（对比经验）::*/
	public Double getGive_money_by_times(){
		return this.give_money_by_times;
	}
	/**回收材料获得碎片数量与购买价格的比值::*/
	public void setMaterial_sale_piece_percent(Double material_sale_piece_percent){
		this.material_sale_piece_percent = material_sale_piece_percent;
	}
	/**材料背包的格子总数::*/
	public void setBag_item_count(Integer bag_item_count){
		this.bag_item_count = bag_item_count;
	}
	/**恢复体力时长：分钟::*/
	public void setRegain_stamina_time_long(Integer regain_stamina_time_long){
		this.regain_stamina_time_long = regain_stamina_time_long;
	}
	/**体力上限::*/
	public void setMax_stamina(Integer max_stamina){
		this.max_stamina = max_stamina;
	}
	/**剧本产出金钱的比例（对比经验）::*/
	public void setGive_money_by_times(Double give_money_by_times){
		this.give_money_by_times = give_money_by_times;
	}
}