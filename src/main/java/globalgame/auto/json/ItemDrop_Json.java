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
public class ItemDrop_Json{
	/** ID::*/
	private Integer	id;
	/** 掉落组ID::*/
	private Integer	dropGruopID;
	/** 物品ID::*/
	private Integer	itemID;
	/** 物品数量::*/
	private Integer	itemCnt;
	/** 权重::*/
	private Integer	itemWeight;

	/** ID::*/
	public Integer getId(){
		return this.id;
	}
	/** 掉落组ID::*/
	public Integer getDropGruopID(){
		return this.dropGruopID;
	}
	/** 物品ID::*/
	public Integer getItemID(){
		return this.itemID;
	}
	/** 物品数量::*/
	public Integer getItemCnt(){
		return this.itemCnt;
	}
	/** 权重::*/
	public Integer getItemWeight(){
		return this.itemWeight;
	}
	/**ID::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**掉落组ID::*/
	public void setDropGruopID(Integer dropGruopID){
		this.dropGruopID = dropGruopID;
	}
	/**物品ID::*/
	public void setItemID(Integer itemID){
		this.itemID = itemID;
	}
	/**物品数量::*/
	public void setItemCnt(Integer itemCnt){
		this.itemCnt = itemCnt;
	}
	/**权重::*/
	public void setItemWeight(Integer itemWeight){
		this.itemWeight = itemWeight;
	}
}