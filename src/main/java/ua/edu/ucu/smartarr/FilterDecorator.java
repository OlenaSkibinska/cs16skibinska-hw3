package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate myPredicate;
    public FilterDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        this.myPredicate = myPredicate;

    }

    @Override
    public Object[] toArray() {
        Object[] finitaFilt = new Object[size()];
        int index = 0;
        for (int i = 0; i < smartArray.size(); i++) {
            if (myPredicate.test(smartArray.toArray()[i])) {
                finitaFilt[index] = smartArray.toArray()[i];
                index++;
            }
        }
        return finitaFilt;
    }

    @Override
    public String operationDescription() {
        return "Using filter decorator based on MyPredicate.";
    }

    @Override
    public int size() {
        int finitaFiltSize = 0;
        for (int i = 0; i < smartArray.size(); i++) {
            if (myPredicate.test(smartArray.toArray()[i])) {
                finitaFiltSize++;
            }
        }
        return finitaFiltSize;
    }
}
