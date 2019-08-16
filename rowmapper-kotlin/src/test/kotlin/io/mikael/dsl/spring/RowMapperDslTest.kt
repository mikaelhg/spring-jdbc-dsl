package io.mikael.dsl.spring

import io.mikael.dsl.spring.RowMapperDsl.rowMapper
import org.junit.jupiter.api.Test
import java.lang.RuntimeException

class RowMapperDslTest {

    class Foo(var a: String, var b: Int)

    @Test
    fun dslTest() {

        val rm1 = rowMapper<Foo> {
            supplier { Foo("a", 1) }

            except(RuntimeException::class.java) { e -> println(e) }
        }

    }

}
