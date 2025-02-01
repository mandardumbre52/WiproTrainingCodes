package com.wipro.boot.annotations;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryExample {
    public String getData() {
        return "Fetching data from Repository Layer...";
    }
}
