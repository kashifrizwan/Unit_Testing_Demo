package unit_tests;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayListTest {

    @Test
    public void letsMockListSize() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);

        assertEquals(2, listMock.size());
    }

    @Test
    public  void letsMockListSize_MultipleReturnsvalues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());

        verify(listMock, atLeast(2)).size();
    }

    @Test
    public void letsMockListGetMethod() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("I am Crazy");

        assertEquals("I am Crazy", listMock.get(0));
        assertNull(null, listMock.get(1));
    }

    @Test
    public void letsMockListGetMethod_usingArgumentMatcher() {
        List listMock = mock(List.class);

        //Argument Matcher anyInt()
        when(listMock.get(anyInt())).thenReturn("I am Crazy");

        assertEquals("I am Crazy", listMock.get(0));
        assertEquals("I am Crazy", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockList_throwAnException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something Went Wrong"));

        listMock.get(0);
    }

}
