package com.automationacid.co.tasks;

import com.google.common.net.HttpHeaders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ActualizarUsuario implements Task {
    private final int id;

    public ActualizarUsuario(int id) {
        this.id = id;
    }

    public static ActualizarUsuario conId(int id) {
        return instrumented(ActualizarUsuario.class, id);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to("/posts/{id}")
                        .with(request -> request.pathParam("id", id)
                                .header(HttpHeaders.CONTENT_TYPE,
                                        "application/json")
                                .body("{\"title\": \"Prueba Hervin\"}")
                        )
        );
    }
}
