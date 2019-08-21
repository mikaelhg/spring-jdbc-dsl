package io.mikael.dsl.spring;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RowMapperBuilder<T> {

    private Supplier<T> supplier;

    private List<Consumer<? extends Exception>> exceptionHandlers = concurrentList();

    public RowMapper<T> build() {
        return (rs, rowNum) -> supplier.get();
    }

    public RowMapperBuilder<T> supplier(final Supplier<T> supplier) {
        this.supplier = supplier;
        return this;
    }

    public <E extends Exception> RowMapperBuilder<T> except(
            final Class<E> exceptionClass, final Consumer<E> exceptionHandler)
    {
        this.exceptionHandlers.add(exceptionHandler);
        return this;
    }

    protected <ITEM> List<ITEM> concurrentList() {
        return new CopyOnWriteArrayList<>();
    }

}
