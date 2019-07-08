package com.springboot.spring_hateoas.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class Greeting extends ResourceSupport {
    private String content;

    public Greeting() {
    }

    //    @JsonCreator
    //    @JsonProperty("content")
    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "content='" + content + '\'' +
                '}';
    }
}
