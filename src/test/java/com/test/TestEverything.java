package com.test;

import com.oop.Actress;
import com.oop.Person;
import com.oop.Waitress;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestEverything {
    @Test
    public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson(){
        assertThat(new Waitress("Mary", "mary@domain.com", 22))
        .isInstanceOf(Person.class);
    }

    @Test
    public void givenActressInstance_whenCheckedType_thenIsInstanceOfPerson(){
        assertThat(new Actress("Nayanthara", "nayan@domain.com", 21))
                .isInstanceOf(Person.class);
    }

}
