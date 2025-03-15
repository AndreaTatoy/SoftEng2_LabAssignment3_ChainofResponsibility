package LabAssignment3_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        WasteContainer container1 = new WasteContainer("organic", 100);
        WasteContainer container2 = new WasteContainer("recyclable", 80);
        WasteContainer container3 = new WasteContainer("hazardous", 100);

        WasteCollector organicCollector = new OrganicCollector();
        WasteCollector recyclableCollector = new RecyclableCollector();
        WasteCollector hazardousCollector = new HazardousCollector();

        organicCollector.setNext(recyclableCollector);
        recyclableCollector.setNext(hazardousCollector);

        System.out.println("\nCollecting Container 1");
        organicCollector.collect(container1);

        System.out.println("\n\nCollecting Container 2");
        organicCollector.collect(container2);

        System.out.println("\n\nCollecting Container 3");
        organicCollector.collect(container3);
    }
}

