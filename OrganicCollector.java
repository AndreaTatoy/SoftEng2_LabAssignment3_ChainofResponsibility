package LabAssignment3_ChainOfResponsibility;

public class OrganicCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNext(WasteCollector collector) {
        this.nextCollector = collector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic") && container.isFull()) {
            System.out.println("Collecting organic waste (Capacity: " + container.getCapacity() + "%)");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("No collector available for this type of waste.");
        }
    }
}

