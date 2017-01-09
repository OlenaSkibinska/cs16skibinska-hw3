package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction myFunction;
    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        this.myFunction = myFunction;
    }

    @Override
    public Object[] toArray() {
        Object[] finitaMap = smartArray.toArray();
        for (int i = 0; i < smartArray.size(); i++) {
            finitaMap[i] = myFunction.apply(smartArray.toArray()[i]);
        }
        return finitaMap;
    }

    @Override
    public String operationDescription() {
        return "Using mapping decorator based on MyFunction.";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
