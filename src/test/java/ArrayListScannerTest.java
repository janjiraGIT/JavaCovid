

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListScannerTest {

    private ArrayList<Integer> list;

    @Test
    void shouldFindCorrectHighNumber() {
        list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(1);
        list.add(100);
        list.add(115);
        var arrayListScanner = new ArrayListScanner();
        assertEquals(115, arrayListScanner.findTheHighestNumber(list));
    }

    @Test
    void shouldReturnNotCorrectHighNumber() {
        list = new ArrayList<>();
        list.add(10);
        list.add(5);
        var arrayListScanner = new ArrayListScanner();
        assertNotEquals(115, arrayListScanner.findTheLowestNumber(list));
    }

    @Test
    void shouldFindCorrectMinNumber() {
        list = new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(15);
        var arrayListScanner = new ArrayListScanner();
        assertEquals(5, arrayListScanner.findTheLowestNumber(list));
    }

    @Test
    void shouldSumCorrectNumber() {
        list = new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(15);
        var arrayListScanner = new ArrayListScanner();
        assertEquals(40, arrayListScanner.sumAllNumbers(list));
    }

}