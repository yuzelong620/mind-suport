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
public class Active_Json{
	/** 礼包编号::*/
	private Integer	id;
	/** 礼包名称::*/
	private String	name;
	/** 活跃值::*/
	private Integer	num;
	/** 掉落组::*/
	private List<Integer>	dropGroup;

	/** 礼包编号::*/
	public Integer getId(){
		return this.id;
	}
	/** 礼包名称::*/
	public String getName(){
		return this.name;
	}
	/** 活跃值::*/
	public Integer getNum(){
		return this.num;
	}
	/** 掉落组::*/
	public List<Integer> getDropGroup(){
		return this.dropGroup;
	}
	/**礼包编号::*/
	public void setId(Integer id){
		this.id = id;
	}
	/**礼包名称::*/
	public void setName(String name){
		this.name = name;
	}
	/**活跃值::*/
	public void setNum(Integer num){
		this.num = num;
	}
	/**掉落组::*/
	public void setDropGroup(List<Integer> dropGroup){
		this.dropGroup = dropGroup;
	}
}