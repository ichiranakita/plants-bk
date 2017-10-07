package com.ichiranakita.plants;

/**
 * Created by ichiranakita on 10/7/17.
 */
public class Greeting {
    private final String content;
    private final long id;

    public Greeting(long id, String content) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
