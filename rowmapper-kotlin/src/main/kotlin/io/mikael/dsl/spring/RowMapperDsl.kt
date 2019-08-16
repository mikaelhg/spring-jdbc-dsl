package io.mikael.dsl.spring

import org.springframework.jdbc.core.RowMapper

object RowMapperDsl {

    fun <T> rowMapper(function: RowMapperBuilder<T>.() -> Unit): RowMapper<T> =
            RowMappers.builder<T>().apply(function::invoke).build()

}
