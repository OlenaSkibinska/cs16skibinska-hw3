package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArray){
        super(smartArray);
    }


    @Override
    public Object[] toArray() {
        Object[] finita = new Object[smartArray.size()];
        int index = 0;
        int check = 0;
        for(int i = 0; i < smartArray.size(); i++){
            for (int j = i + 1; j < smartArray.size(); j++){
                if(smartArray.toArray()[i].equals(smartArray.toArray()[j])){
                    check = 1;
                    break;
                }
            }
            if (check == 0){
                finita[index] = smartArray.toArray()[i];
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
        int finitaSize = smartArray.size();
        for (int i = 0; i < smartArray.size(); i++){
            for(int j = 0; j < smartArray.size(); j++){
                if(!(smartArray.toArray()[i].equals(smartArray.toArray()[j]))){
                    finitaSize++;
                    break;
                }
            }
        }
        return finitaSize;
    }
}
