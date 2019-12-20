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
public class Ranking_Json{
	/** 编号::*/
	private Integer	id;
	/** 装备名称::*/
	private String	name;
	/** 类型::*/
	private Integer	type;
	/** 下限::*/
	private Integer	dMinLevel;
	/** 上限::*/
	private Integer	dMaxlevel;
	/** 人气加成百分比::*/
	private Double	RQPercent;
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
	/** 下限::*/
	public Integer getDMinLevel(){
		return this.dMinLevel;
	}
	/** 上限::*/
	public Integer getDMaxlevel(){
		return this.dMaxlevel;
	}
	/** 人气加成百分比::*/
	public Double getRQPercent(){
		return this.RQPercent;
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
	/**下限::*/
	public void setDMinLevel(Integer dMinLevel){
		this.dMinLevel = dMinLevel;
	}
	/**上限::*/
	public void setDMaxlevel(Integer dMaxlevel){
		this.dMaxlevel = dMaxlevel;
	}
	/**人气加成百分比::*/
	public void setRQPercent(Double RQPercent){
		this.RQPercent = RQPercent;
	}
	/**描述::*/
	public void setDescription(String description){
		this.description = description;
	}
}