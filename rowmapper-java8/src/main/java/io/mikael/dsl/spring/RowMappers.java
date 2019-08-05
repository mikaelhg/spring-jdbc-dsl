package io.mikael.dsl.spring;

import java.util.function.Supplier;

public class RowMappers {

    public static <T> RowMapperBuilder<T> builder() {
        return new RowMapperBuilder<>();
    }

    public static <T> RowMapperBuilder<T> builder(final T instance) {
        return builder(() -> instance);
    }

    public static <T> RowMapperBuilder<T> builder(final Class<T> clazz) {
        return new RowMapperBuilder<>();
    }

    public static <T> RowMapperBuilder<T> builder(final Supplier<T> supplier) {
        return new RowMapperBuilder<T>().supplier(supplier);
    }

}
