package todo_example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {

    @Test
    public void testTodosRelatedToSpring_usingMock () {

        TodoService mTodoServiceMock = mock(TodoService.class);
        when(mTodoServiceMock.retrieveToDosList("Dummy_User")).thenReturn(Arrays.asList("Learning Java Spring", "Learning Angular Js", "Learning Spring Bot"));

        TodoBusinessImpl mTodoBusinessImpl = new TodoBusinessImpl(mTodoServiceMock);
        List<String> filteredTodos = mTodoBusinessImpl.retrieveTodosRelatedToSpring("Dummy_User");
        Assert.assertEquals(2, filteredTodos.size());
    }


    @Test
    public void testTodosEmptyString_usingMock () {

        TodoService mTodoServiceMock = mock(TodoService.class);
        when(mTodoServiceMock.retrieveToDosList("Dummy_User")).thenReturn(Arrays.asList());


        TodoBusinessImpl mTodoBusinessImpl = new TodoBusinessImpl(mTodoServiceMock);
        List<String> filteredTodos = mTodoBusinessImpl.retrieveTodosRelatedToSpring("Dummy_User");
        Assert.assertEquals(0, filteredTodos.size());
    }

}
