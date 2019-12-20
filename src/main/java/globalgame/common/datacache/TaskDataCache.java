package globalgame.common.datacache;

import com.globalgame.auto.json.Task_Json;
import com.globalgame.common.DataCache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskDataCache extends DataCache<Task_Json> {
    private HashMap<String, List<Task_Json>> map = new HashMap<>();
    private Map<Integer, List<Task_Json>> taskTypeMap = new HashMap<>();
    private List<String> taskTypes = new ArrayList<>();

    @Override
    protected void setDataCache(List<Task_Json> datas) {
        for (Task_Json json : datas) {
            List<Task_Json> list = map.get(json.getTaskType());
            if (list == null) {
                list = new ArrayList<>();
                map.put(json.getTaskType(), list);
                taskTypes.add(json.getTaskType());
            }
            list.add(json);
            List<Task_Json> taskTypeJsons = taskTypeMap.get(json.getType());
            if(taskTypeJsons == null) {
                taskTypeJsons = new ArrayList<>();
                taskTypeMap.put(json.getType(), taskTypeJsons);
            }
            taskTypeJsons.add(json);
        }
    }

    public List<Task_Json> getTaskByTaskType(String taskType) {
        return map.get(taskType);
    }

    public Integer getTaskIndex(String taskType, Integer taskId) {
        List<Task_Json> task_jsons = getTaskByTaskType(taskType);
        for (int i = 0; i < task_jsons.size(); i++) {
            if (task_jsons.get(0).getId().equals(taskId)) {
                return i;
            }
        }
        return null;
    }

    public List<String> getAllTaskTypes() {
        return taskTypes;
    }

    public List<Task_Json> getTaskByType(Integer type) {
        return taskTypeMap.get(type);
    }
}
