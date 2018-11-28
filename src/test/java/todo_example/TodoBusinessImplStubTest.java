package todo_example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingStub () {

        TodoService mTodoServiceStub = new ToDoServiceStub();
        TodoBusinessImpl mTodoBusinessImpl = new TodoBusinessImpl(mTodoServiceStub);

        List<String> filteredTodos = mTodoBusinessImpl.retrieveTodosRelatedToSpring("Dummy_User");
        Assert.assertEquals(2, filteredTodos.size());
    }

}
