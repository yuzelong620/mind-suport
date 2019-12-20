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
public class EquipDLevelUp_Json{
	/** 编号::*/
	private Integer	id;
	/** 装备名称::*/
	private String	name;
	/** 阶位::*/
	private Integer	level;
	/** 合成所需材料<材料ID，材料数量>::*/
	private List<IntTuple>	items;
	/** 目标装备::*/
	private Integer	toEquipId;

	/** 编号::*/
	public Integer getId(){
		return this.id;
	}
	/** 装备名称::*/
	public String getName(){
		return this.name;
	}
	/** 阶位::*/
	public Integer getLevel(){
		return this.level;
	}
	/** 合成所需材料<材料ID，材料数量>::*/
	public List<IntTuple> getItems(){
		return this.items;
	}
	/** 目标装备::*/
	public Integer getToEquipId(){
		return this.toEquipId;
	}
	/**编号::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**装备名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**阶位::*/
	public void setLevel(Integer level){
		this.level = level;
	}
	/**合成所需材料<材料ID，材料数量>::*/
	public void setItems(List<IntTuple> items){
		this.items = items;
	}
	/**目标装备::*/
	public void setToEquipId(Integer toEquipId){
		this.toEquipId = toEquipId;
	}
}