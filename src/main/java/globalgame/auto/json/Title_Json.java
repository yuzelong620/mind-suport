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
public class Title_Json{
	/** 编号::*/
	private Integer	id;
	/** 装备名称::*/
	private String	name;
	/** 类型::*/
	private Integer	type;
	/** 人气加成值::*/
	private Integer	RQValue;
	/** 描述::*/
	private String	description;

	/** 编号::*/
	public Integer getId(){
		return this.id;
	}
	/** 装备名称::*/
	public String getName(){
		return this.name;
	}
	/** 类型::*/
	public Integer getType(){
		return this.type;
	}
	/** 人气加成值::*/
	public Integer getRQValue(){
		return this.RQValue;
	}
	/** 描述::*/
	public String getDescription(){
		return this.description;
	}
	/**编号::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**装备名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**类型::*/
	public void setType(Integer type){
		this.type = type;
	}
	/**人气加成值::*/
	public void setRQValue(Integer RQValue){
		this.RQValue = RQValue;
	}
	/**描述::*/
	public void setDescription(String description){
		this.description = description;
	}
}