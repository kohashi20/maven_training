package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @ParameterizedTest
    @CsvSource({
        "1, 1, 2",
        "-5, 5, 0",
    })
    void add_behavior(int a, int b, int expectedResult){
        int result = new Sample().op(Sample.Operation.ADD, a, b);
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1, 1",
        "-5, 5, -25",
    })
    void multiply_behavior(int a, int b, int expectedResult){
        int result = new Sample().op(Sample.Operation.MULT, a, b);
        assertThat(result).isEqualTo(expectedResult);
    }
}
