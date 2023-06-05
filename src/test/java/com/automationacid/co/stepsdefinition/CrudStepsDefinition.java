package com.automationacid.co.stepsdefinition;


import com.automationacid.co.tasks.ActualizarUsuario;
import com.automationacid.co.tasks.CrearUsuario;
import com.automationacid.co.tasks.EncontrarUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;


public class CrudStepsDefinition {

    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;
    private Actor hervin;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://jsonplaceholder.typicode.com");
        hervin = Actor.named("Hervin automation test").whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

    @Given("el id de usuario {int} del solicitud metodo Get")
    public void elIdDeUsuarioDelUsuarioSolicitudGet(Integer id) {
        hervin.attemptsTo(
                EncontrarUsuario.conId(id)
        );
    }
    @Then("valido exista el codeStatus {int}")
    public void validoExistaElCodeStatus(Integer statusCode) {
        hervin.should(
                seeThatResponse(response -> response.statusCode(statusCode))
        );

    }
    @Given("el id de usuario {int} del solicitud metodo Put")
    public void elIdDeUsuarioDelUsuarioSolicitudPut(Integer id) {
        hervin.attemptsTo(
                ActualizarUsuario.conId(id)
        );
    }

    @Given("la solicutud Post")
    public void laSolicutudPost() {
        hervin.attemptsTo(
                CrearUsuario.CrearUsuario()
        );
    }


}
