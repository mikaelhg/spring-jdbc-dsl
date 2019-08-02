package io.mikael.dsl.spring;

public class RowMappers {

    public <T> RowMapperBuilder<T> builder() {
        return new RowMapperBuilder<>();
    }

}
