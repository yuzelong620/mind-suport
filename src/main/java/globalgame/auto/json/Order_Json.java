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
public class Order_Json{
	/** 编号::*/
	private Integer	id;
	/** 名称::*/
	private String	name;
	/** 阶位::*/
	private Integer	level;
	/** 人气加成值::*/
	private Integer	RQValue;
	/** 合成所需材料<材料ID，材料数量>::*/
	private List<IntTuple>	items;
	/** 描述::*/
	private String	description;
	/** 来源::*/
	private Integer	from;
	/** 图片::*/
	private String	icon;

	/** 编号::*/
	public Integer getId(){
		return this.id;
	}
	/** 名称::*/
	public String getName(){
		return this.name;
	}
	/** 阶位::*/
	public Integer getLevel(){
		return this.level;
	}
	/** 人气加成值::*/
	public Integer getRQValue(){
		return this.RQValue;
	}
	/** 合成所需材料<材料ID，材料数量>::*/
	public List<IntTuple> getItems(){
		return this.items;
	}
	/** 描述::*/
	public String getDescription(){
		return this.description;
	}
	/** 来源::*/
	public Integer getFrom(){
		return this.from;
	}
	/** 图片::*/
	public String getIcon(){
		return this.icon;
	}
	/**编号::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**阶位::*/
	public void setLevel(Integer level){
		this.level = level;
	}
	/**人气加成值::*/
	public void setRQValue(Integer RQValue){
		this.RQValue = RQValue;
	}
	/**合成所需材料<材料ID，材料数量>::*/
	public void setItems(List<IntTuple> items){
		this.items = items;
	}
	/**描述::*/
	public void setDescription(String description){
		this.description = description;
	}
	/**来源::*/
	public void setFrom(Integer from){
		this.from = from;
	}
	/**图片::*/
	public void setIcon(String icon){
		this.icon = icon;
	}
}