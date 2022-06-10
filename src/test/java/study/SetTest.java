package study;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class SetTest {

  private Set<Integer> numbers;

  private static Stream<Integer> argumentProvider(Set<Integer> numbers) {
    return Stream.of(numbers.toArray(new Integer[0]));
  }

  // Test Case 구현

  @BeforeEach
  void setUp() {
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  @Test
  void size() {
    int actual = numbers.size();
    assertThat(actual).isEqualTo(3);
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  void contains_ShouldReturnTrueAllCase(int number) {
    assertTrue(numbers.contains(number));
  }
}
