# Json Class - Example Usage

This guide demonstrates how to use the `Json` class to create and manipulate a simple JSON object in Java. Below is an example that shows how to add key-value pairs, retrieve values, get the JSON object as a map, and clear the JSON object.

## Example Script

```java
// Set key-value pairs in the JSON object
Json.set("id", 1);
Json.set("name", "Hf wassim");
Json.set("city", "Tunisia");

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

```
<br>

## Java Spring-Boot Controller Exemple :
1. Ensure to create a `libs` folder and place the `Json.java` file inside it.
2. To import both classes and the library in your Java file, use the following import statements at the top of your Java class:

```java
import com.example.demo.libs.Json;
import java.util.Map;
```

These imports allow you to use the `Json` class from the `libs` package and the `Map` interface from `java.util`.
<br><br><br>
<b>Code : <b>
```java
package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.libs.Json;
import java.util.Map;

@RestController
@RequestMapping("/developer")
public class DevController {

    @GetMapping("/info")
    public Map<String, Object> getDevInfo() {
        // Set key-value pairs for the JSON object
        Json.set("id", 1);
        Json.set("name", "Hf wassim");
        Json.set("city", "Tunisia");

        // Return the JSON object as a Map
        return Json.response();
    }
}

```
<br>
<b>Output Exemple : <b>

```Json
{
    "id":1, 
    "name":"Hf wassim", 
    "city":"Tunisia"
}
```