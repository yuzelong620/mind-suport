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
public class OVEscript_Json{
	/** 剧本编号::*/
	private Integer	id;
	/** 剧本名称::*/
	private String	name;
	/** 剧本类型::*/
	private String	type;
	/** 消耗体力::*/
	private Integer	costStamina;
	/** 可恢复体力::*/
	private Integer	giveStamina;
	/** 3星条件::*/
	private List<StringIntTuple>	star3;
	/** 2星条件::*/
	private List<StringIntTuple>	star2;
	/** 1星条件::*/
	private List<StringIntTuple>	star1;
	/** 预估时长m::*/
	private Integer	costTimeByMin;
	/** 奖励列表::*/
	private List<IntTuple>	rewardList;
	/** 排序::*/
	private Integer	sortID;
	/** 封面URL地址::*/
	private String	pngUrl;

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
	public Integer getCostStamina(){
		return this.costStamina;
	}
	/** 可恢复体力::*/
	public Integer getGiveStamina(){
		return this.giveStamina;
	}
	/** 3星条件::*/
	public List<StringIntTuple> getStar3(){
		return this.star3;
	}
	/** 2星条件::*/
	public List<StringIntTuple> getStar2(){
		return this.star2;
	}
	/** 1星条件::*/
	public List<StringIntTuple> getStar1(){
		return this.star1;
	}
	/** 预估时长m::*/
	public Integer getCostTimeByMin(){
		return this.costTimeByMin;
	}
	/** 奖励列表::*/
	public List<IntTuple> getRewardList(){
		return this.rewardList;
	}
	/** 排序::*/
	public Integer getSortID(){
		return this.sortID;
	}
	/** 封面URL地址::*/
	public String getPngUrl(){
		return this.pngUrl;
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
	public void setCostStamina(Integer costStamina){
		this.costStamina = costStamina;
	}
	/**可恢复体力::*/
	public void setGiveStamina(Integer giveStamina){
		this.giveStamina = giveStamina;
	}
	/**3星条件::*/
	public void setStar3(List<StringIntTuple> star3){
		this.star3 = star3;
	}
	/**2星条件::*/
	public void setStar2(List<StringIntTuple> star2){
		this.star2 = star2;
	}
	/**1星条件::*/
	public void setStar1(List<StringIntTuple> star1){
		this.star1 = star1;
	}
	/**预估时长m::*/
	public void setCostTimeByMin(Integer costTimeByMin){
		this.costTimeByMin = costTimeByMin;
	}
	/**奖励列表::*/
	public void setRewardList(List<IntTuple> rewardList){
		this.rewardList = rewardList;
	}
	/**排序::*/
	public void setSortID(Integer sortID){
		this.sortID = sortID;
	}
	/**封面URL地址::*/
	public void setPngUrl(String pngUrl){
		this.pngUrl = pngUrl;
	}
}