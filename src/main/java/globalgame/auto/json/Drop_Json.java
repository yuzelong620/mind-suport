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
public class Drop_Json{
	/** 编号::*/
	private Integer	id;
	/** 名称::*/
	private String	name;
	/** 组号::*/
	private Integer	groupID;
	/** 掉落组分布<子掉落组,权值>::*/
	private List<IntTuple>	dropList;
	/** 等级下限::*/
	private Integer	minLevel;
	/** 等级上限::*/
	private Integer	maxLevel;

	/** 编号::*/
	public Integer getId(){
		return this.id;
	}
	/** 名称::*/
	public String getName(){
		return this.name;
	}
	/** 组号::*/
	public Integer getGroupID(){
		return this.groupID;
	}
	/** 掉落组分布<子掉落组,权值>::*/
	public List<IntTuple> getDropList(){
		return this.dropList;
	}
	/** 等级下限::*/
	public Integer getMinLevel(){
		return this.minLevel;
	}
	/** 等级上限::*/
	public Integer getMaxLevel(){
		return this.maxLevel;
	}
	/**编号::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**组号::*/
	public void setGroupID(Integer groupID){
		this.groupID = groupID;
	}
	/**掉落组分布<子掉落组,权值>::*/
	public void setDropList(List<IntTuple> dropList){
		this.dropList = dropList;
	}
	/**等级下限::*/
	public void setMinLevel(Integer minLevel){
		this.minLevel = minLevel;
	}
	/**等级上限::*/
	public void setMaxLevel(Integer maxLevel){
		this.maxLevel = maxLevel;
	}
}