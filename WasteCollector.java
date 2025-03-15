package LabAssignment3_ChainOfResponsibility;

public interface WasteCollector {
    void setNext(WasteCollector collector);
    void collect(WasteContainer container);
}

