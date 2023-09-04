package com.mozahidone.chapter2.item5;

// Resource interface representing an external resource
interface Resource {
    void fetchData();
}

// Class that depends on the Resource
class ResourceConsumer {
    private final Resource resource;

    // Constructor injection: The Resource is provided through the constructor
    public ResourceConsumer(Resource resource) {
        this.resource = resource;
    }

    // Method that uses the injected Resource
    public void useResource() {
        // Use the resource here
        resource.fetchData();
    }
}

// Implementation of the Resource interface
class DatabaseResource implements Resource {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from the database...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Resource instance (DatabaseResource)
        Resource databaseResource = new DatabaseResource();

        // Inject the Resource into the ResourceConsumer
        ResourceConsumer consumer = new ResourceConsumer(databaseResource);

        // Use the Resource within the ResourceConsumer
        consumer.useResource();
    }
}
