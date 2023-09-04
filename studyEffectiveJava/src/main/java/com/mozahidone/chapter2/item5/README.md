# Item 5: Prefer dependency injection to hardwiring resources
In this example:

1. We define a Resource interface representing an external resource (e.g., a database connection).

2. The ResourceConsumer class depends on a Resource but doesn't create it directly.

3. Instead, the ResourceConsumer class accepts a Resource through its constructor. This is constructor injection, and it allows us to inject different resources when needed.

4. We create an instance of the DatabaseResource class that implements the Resource interface.

5. We inject the DatabaseResource into the ResourceConsumer.

6. The ResourceConsumer can now use the injected Resource without needing to know how it's created or managed.

Example 1: Hardwiring a Database Connection

In this example, a class tightly couples itself with a specific database connection:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
private Connection connection;

    public DatabaseService() {
        try {
            // Hardwiring the database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeQuery(String query) {
        // Use the hardcoded database connection to execute the query
        // ...
    }
}

In this code, the DatabaseService class directly creates a database connection within its constructor. This tightly couples the class to a specific database, making it hard to switch to a different database or perform unit testing without connecting to the actual database.