package com.example.restservice;

/** get - /greeting
 * { id: 1, content : "Hello, World" }**/
public record Greeting(long id, String content) {
}
