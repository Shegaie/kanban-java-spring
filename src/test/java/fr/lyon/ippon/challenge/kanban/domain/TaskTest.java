package fr.lyon.ippon.challenge.kanban.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    void shouldNotBuildWithoutTitle() {
        assertThatThrownBy(() -> new Task(null)).isExactlyInstanceOf(RuntimeException.class);
    }
}
