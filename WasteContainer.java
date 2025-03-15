package LabAssignment3_ChainOfResponsibility;

public class WasteContainer {
    private String type;
    private int capacity;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return capacity >= 100;
    }
}