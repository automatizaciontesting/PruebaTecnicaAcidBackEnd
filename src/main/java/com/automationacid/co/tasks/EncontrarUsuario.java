package com.automationacid.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EncontrarUsuario implements Task {

    private final int id;

    public EncontrarUsuario(int id) {
        this.id = id;
    }

    public static EncontrarUsuario conId(int id) {
        return instrumented(EncontrarUsuario.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/posts/{id}")
                        .with(request -> request.pathParam("id", id))
        );

    }
}
