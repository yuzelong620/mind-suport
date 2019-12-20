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
public class Task_Json{
	/** 任务ID::*/
	private Integer	id;
	/** 任务类型::*/
	private Integer	type;
	/** 目标类型::*/
	private String	taskType;
	/** 目标数值::*/
	private Integer	taskValue;
	/** 任务描述::*/
	private String	desc;
	/** 奖励LIST(显示用）::*/
	private List<IntTuple>	drawShow;
	/** 奖励掉落组（配置用）::*/
	private Integer	dropGroup;
	/** 奖励活跃::*/
	private Integer	activeValue;

	/** 任务ID::*/
	public Integer getId(){
		return this.id;
	}
	/** 任务类型::*/
	public Integer getType(){
		return this.type;
	}
	/** 目标类型::*/
	public String getTaskType(){
		return this.taskType;
	}
	/** 目标数值::*/
	public Integer getTaskValue(){
		return this.taskValue;
	}
	/** 任务描述::*/
	public String getDesc(){
		return this.desc;
	}
	/** 奖励LIST(显示用）::*/
	public List<IntTuple> getDrawShow(){
		return this.drawShow;
	}
	/** 奖励掉落组（配置用）::*/
	public Integer getDropGroup(){
		return this.dropGroup;
	}
	/** 奖励活跃::*/
	public Integer getActiveValue(){
		return this.activeValue;
	}
	/**任务ID::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**任务类型::*/
	public void setType(Integer type){
		this.type = type;
	}
	/**目标类型::*/
	public void setTaskType(String taskType){
		this.taskType = taskType;
	}
	/**目标数值::*/
	public void setTaskValue(Integer taskValue){
		this.taskValue = taskValue;
	}
	/**任务描述::*/
	public void setDesc(String desc){
		this.desc = desc;
	}
	/**奖励LIST(显示用）::*/
	public void setDrawShow(List<IntTuple> drawShow){
		this.drawShow = drawShow;
	}
	/**奖励掉落组（配置用）::*/
	public void setDropGroup(Integer dropGroup){
		this.dropGroup = dropGroup;
	}
	/**奖励活跃::*/
	public void setActiveValue(Integer activeValue){
		this.activeValue = activeValue;
	}
}