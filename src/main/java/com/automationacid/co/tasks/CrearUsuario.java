package com.automationacid.co.tasks;

import com.google.common.net.HttpHeaders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {
    public static CrearUsuario CrearUsuario() {
        return instrumented(CrearUsuario.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Post.to("/posts")
                        .with(request -> request
                                .header(HttpHeaders.CONTENT_TYPE,
                                        "application/json")
                                .body("{\"title\": \"prueba tecnica\",\"body\": \"et iusto sed quo iurenvoluptatem occaecati\",\"userId\": \"102\"}")
                        )
        );
    }
}
