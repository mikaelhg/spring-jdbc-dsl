package io.mikael.dsl.spring;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.RowMapper;

public class RowMapperBuilderTest {

    private static class Foo {}

    private static class Bar extends Foo {}

    @Test
    public void simpleBuilder() {
        final RowMapper<String> m1 = RowMappers.<String>builder().build();
        final RowMapper<String> m2 = RowMappers.builder(String.class).build();
    }

    @Test
    public void supplier() {
        final RowMapper<String> m1 = RowMappers.<String>builder().supplier(String::new).build();
        final RowMapper<String> m2 = RowMappers.builder(String::new).build();
        final RowMapper<Foo> m3 = RowMappers.builder(Foo::new).build();
//        final RowMapper<Foo> m4 = RowMappers.builder(Bar::new).build(); won't compile
    }

}
