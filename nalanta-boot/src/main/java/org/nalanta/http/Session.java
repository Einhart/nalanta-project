package org.nalanta.http;

public interface Session {

    String id();

    Object get(String key);

    Session put(String key, Object value);

    Session remove(String key);

}