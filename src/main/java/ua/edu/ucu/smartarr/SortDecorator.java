package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    private MyComparator myComparator;
    public SortDecorator(SmartArray smartArray, MyComparator myComparator){
        super(smartArray);
        this.myComparator = myComparator;
    }

    @Override
    public Object[] toArray() {
        Object[] finitaSor = new Object[smartArray.size()];
        Arrays.sort(finitaSor, myComparator);
        return finitaSor;
    }

    @Override
    public String operationDescription() {
        return "Using sort decorator based on MyComparator.";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
