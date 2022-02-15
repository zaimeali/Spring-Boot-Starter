package com.starter.app.hello_world;

public class Hello_World {
    private final long id;
    private final String message;

    public Hello_World(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }
}
