package LabAssignment3_ChainOfResponsibility;

public class RecyclableCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNext(WasteCollector collector) {
        this.nextCollector = collector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable") && container.isFull()) {
            System.out.println("Collecting recyclable waste (Capacity: " + container.getCapacity() + "%)");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("No collector available for this type of waste.");
        }
    }
}
