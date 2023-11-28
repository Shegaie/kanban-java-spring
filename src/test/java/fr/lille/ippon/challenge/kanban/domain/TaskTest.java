package fr.lille.ippon.challenge.kanban.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TaskTest {
    @Test
    void shouldNotBuildWithoutTitle() {
        assertThatThrownBy(() -> new Task(null)).isExactlyInstanceOf(RuntimeException.class);
    }
}