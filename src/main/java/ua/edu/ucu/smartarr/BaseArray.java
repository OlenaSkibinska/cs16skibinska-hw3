package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{
    protected Object[] newArray;
    public BaseArray(Object[] newArray){
        this.newArray = newArray;
    }
    public Object[] toArray(){
        return newArray;

    }
    public  String operationDescription(){
        return null;
    }
    public  int size(){
        return newArray.length;
    }

}
