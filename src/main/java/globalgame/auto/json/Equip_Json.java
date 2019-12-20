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
public class Equip_Json{
	/** 编号::*/
	private Integer	id;
	/** 装备名称::*/
	private String	name;
	/** 阶位::*/
	private Integer	level;
	/** 类型::*/
	private Integer	type;
	/** 段位::*/
	private Integer	dLevel;
	/** 段位上限::*/
	private Integer	dMaxlevel;
	/** 人气加成值::*/
	private Integer	RQValue;
	/** 描述::*/
	private String	description;
	/** 图片::*/
	private String	icon;

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
	/** 类型::*/
	public Integer getType(){
		return this.type;
	}
	/** 段位::*/
	public Integer getDLevel(){
		return this.dLevel;
	}
	/** 段位上限::*/
	public Integer getDMaxlevel(){
		return this.dMaxlevel;
	}
	/** 人气加成值::*/
	public Integer getRQValue(){
		return this.RQValue;
	}
	/** 描述::*/
	public String getDescription(){
		return this.description;
	}
	/** 图片::*/
	public String getIcon(){
		return this.icon;
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
	/**类型::*/
	public void setType(Integer type){
		this.type = type;
	}
	/**段位::*/
	public void setDLevel(Integer dLevel){
		this.dLevel = dLevel;
	}
	/**段位上限::*/
	public void setDMaxlevel(Integer dMaxlevel){
		this.dMaxlevel = dMaxlevel;
	}
	/**人气加成值::*/
	public void setRQValue(Integer RQValue){
		this.RQValue = RQValue;
	}
	/**描述::*/
	public void setDescription(String description){
		this.description = description;
	}
	/**图片::*/
	public void setIcon(String icon){
		this.icon = icon;
	}
}