package io.mikael.dsl.spring;

import org.springframework.jdbc.core.RowMapper;

import java.util.function.Supplier;

public class RowMapperBuilder<T> {

    private Supplier<T> supplier;

    public RowMapper<T> build() {
        return null;
    }

    public RowMapperBuilder<T> supplier(final Supplier<T> supplier) {
        this.supplier = supplier;
        return this;
    }

}
