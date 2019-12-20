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
public class Stamina_Json{
	/** 剧本编号::*/
	private Integer	id;
	/** 剧本名称::*/
	private String	name;
	/** 剧本类型::*/
	private String	type;
	/** 消耗体力::*/
	private Integer	stamina;
	/** 可恢复体力::*/
	private Integer	backStamina;
	/** 3星条件::*/
	private StringIntTuple	star3;
	/** 2星条件::*/
	private StringIntTuple	star2;
	/** 1星条件::*/
	private StringIntTuple	star1;
	/** 2星奖励::*/
	private List<Integer>	star2Award;
	/** 1星奖励::*/
	private List<Integer>	star1Award;

	/** 剧本编号::*/
	public Integer getId(){
		return this.id;
	}
	/** 剧本名称::*/
	public String getName(){
		return this.name;
	}
	/** 剧本类型::*/
	public String getType(){
		return this.type;
	}
	/** 消耗体力::*/
	public Integer getStamina(){
		return this.stamina;
	}
	/** 可恢复体力::*/
	public Integer getBackStamina(){
		return this.backStamina;
	}
	/** 3星条件::*/
	public StringIntTuple getStar3(){
		return this.star3;
	}
	/** 2星条件::*/
	public StringIntTuple getStar2(){
		return this.star2;
	}
	/** 1星条件::*/
	public StringIntTuple getStar1(){
		return this.star1;
	}
	/** 2星奖励::*/
	public List<Integer> getStar2Award(){
		return this.star2Award;
	}
	/** 1星奖励::*/
	public List<Integer> getStar1Award(){
		return this.star1Award;
	}
	/**剧本编号::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**剧本名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**剧本类型::*/
	public void setType(String type){
		this.type = type;
	}
	/**消耗体力::*/
	public void setStamina(Integer stamina){
		this.stamina = stamina;
	}
	/**可恢复体力::*/
	public void setBackStamina(Integer backStamina){
		this.backStamina = backStamina;
	}
	/**3星条件::*/
	public void setStar3(StringIntTuple star3){
		this.star3 = star3;
	}
	/**2星条件::*/
	public void setStar2(StringIntTuple star2){
		this.star2 = star2;
	}
	/**1星条件::*/
	public void setStar1(StringIntTuple star1){
		this.star1 = star1;
	}
	/**2星奖励::*/
	public void setStar2Award(List<Integer> star2Award){
		this.star2Award = star2Award;
	}
	/**1星奖励::*/
	public void setStar1Award(List<Integer> star1Award){
		this.star1Award = star1Award;
	}
}