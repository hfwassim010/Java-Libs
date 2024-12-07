# Json Class - Example Usage

This guide demonstrates how to use the `Json` class to create and manipulate a simple JSON object in Java. Below is an example that shows how to add key-value pairs, retrieve values, get the JSON object as a map, and clear the JSON object.

## Example Script

```java
// Set key-value pairs in the JSON object
Json.set("id", 1);
Json.set("name", "John Doe");
Json.set("city", "New York");

// Retrieve values by key
System.out.println("ID: " + Json.get("id"));
System.out.println("Name: " + Json.get("name"));
System.out.println("City: " + Json.get("city"));

// Get the JSON object as a Map
Map<String, Object> jsonResponse = Json.response();
System.out.println("JSON Response: " + jsonResponse);

// Clear the JSON object
Json.clear();
System.out.println("After clearing: " + Json.response()); // Output: {}
