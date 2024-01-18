package br.com.helsonsant.lambdadynamo;

import br.com.helsonsant.GravarPerson;
import br.com.helsonsant.PersonRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void handleRequest_shouldReturnConstantValue() {
        GravarPerson function = new GravarPerson();
        Object result = function.handleRequest(new PersonRequest(), null);
        assertEquals(null, result);
    }
}
