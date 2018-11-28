package todo_example;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements TodoService {

    @Override
    public List<String> retrieveToDosList(String user) {
        return Arrays.asList("Learning Java Spring", "Learning Angular Js", "Learning Spring Bot");
    }

}
