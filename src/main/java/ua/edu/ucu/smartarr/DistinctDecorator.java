package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArray){
        super(smartArray);
    }


    @Override
    public Object[] toArray() {
        Object[] finita = new Object[size()];
        int index = 0;
        boolean check;
        for (Object element: smartArray.toArray()) {
            check = false;
            for (int i = 0; i < index; i++){
                if (finita[i].toString().equals(element.toString())) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                finita[index] = element;
                index++;
            }
        }
        return finita;
    }

    @Override
    public String operationDescription() {
        return "Returns new array without equal elements. ";
    }

    @Override
    public int size() {
        int finitaSize = 0;
        for (int i = 0; i < smartArray.size(); i++){
            boolean check = false;
            for(int j = i-1; j >= 0; j--){
                if(smartArray.toArray()[i].toString().equals(smartArray.toArray()[j].toString())){
                    check = true;
                    break;
                }
            }
            if (!check) {
                finitaSize++;
            }
        }
        return finitaSize;
    }
}
