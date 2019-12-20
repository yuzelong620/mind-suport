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
public class Draw_Json{
	/** ID::*/
	private Integer	id;
	/** 名称::*/
	private String	name;
	/** 内容::*/
	private String	desc;
	/** 掉落组::*/
	private List<Integer>	dropGroupList;
	/** 消耗材料::*/
	private Integer	costItemID;
	/** 消耗货币::*/
	private Integer	costMoneyID;
	/** 每材料减少货币值::*/
	private Integer	itemRecValue;
	/** 消耗材料总数::*/
	private Integer	costItemCount;
	/** 十连消耗材料总数::*/
	private Integer	costItemCount10;

	/** ID::*/
	public Integer getId(){
		return this.id;
	}
	/** 名称::*/
	public String getName(){
		return this.name;
	}
	/** 内容::*/
	public String getDesc(){
		return this.desc;
	}
	/** 掉落组::*/
	public List<Integer> getDropGroupList(){
		return this.dropGroupList;
	}
	/** 消耗材料::*/
	public Integer getCostItemID(){
		return this.costItemID;
	}
	/** 消耗货币::*/
	public Integer getCostMoneyID(){
		return this.costMoneyID;
	}
	/** 每材料减少货币值::*/
	public Integer getItemRecValue(){
		return this.itemRecValue;
	}
	/** 消耗材料总数::*/
	public Integer getCostItemCount(){
		return this.costItemCount;
	}
	/** 十连消耗材料总数::*/
	public Integer getCostItemCount10(){
		return this.costItemCount10;
	}
	/**ID::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**内容::*/
	public void setDesc(String desc){
		this.desc = desc;
	}
	/**掉落组::*/
	public void setDropGroupList(List<Integer> dropGroupList){
		this.dropGroupList = dropGroupList;
	}
	/**消耗材料::*/
	public void setCostItemID(Integer costItemID){
		this.costItemID = costItemID;
	}
	/**消耗货币::*/
	public void setCostMoneyID(Integer costMoneyID){
		this.costMoneyID = costMoneyID;
	}
	/**每材料减少货币值::*/
	public void setItemRecValue(Integer itemRecValue){
		this.itemRecValue = itemRecValue;
	}
	/**消耗材料总数::*/
	public void setCostItemCount(Integer costItemCount){
		this.costItemCount = costItemCount;
	}
	/**十连消耗材料总数::*/
	public void setCostItemCount10(Integer costItemCount10){
		this.costItemCount10 = costItemCount10;
	}
}