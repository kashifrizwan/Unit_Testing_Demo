package todo_example;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {

    private TodoService iTodoService;

    public TodoBusinessImpl(TodoService todoService){
        super();
        iTodoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring (String user) {
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = iTodoService.retrieveToDosList(user);

        for (String todo : todos) {
            if (todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }

}
