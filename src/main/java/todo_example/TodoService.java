package todo_example;

import java.util.List;

public interface TodoService {

    List<String> retrieveToDosList(String user);

}
