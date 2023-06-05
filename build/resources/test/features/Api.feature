# encoding: iso-8859-1
Feature: Realizar pruebas backend API jsonplaceholder.typicode.com
  Como usuario quiero realizar crud al jsonplaceholder.typicode.com

  @GetId
  Scenario: Consultar por id y validar el statusCode
    Given el id de usuario 74 del solicitud metodo Get
    Then valido exista el codeStatus 200


  @PutId
  Scenario: Actualizar por id y validar el statusCode
    Given el id de usuario 44 del solicitud metodo Put
    Then valido exista el codeStatus 200

  @PostId
  Scenario: Crear titulo y validar el statusCode
    Given la solicutud Post
    Then valido exista el codeStatus 201





