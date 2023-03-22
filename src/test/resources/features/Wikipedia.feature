Feature: Wikipedia

  @Wikipedia
  Scenario: Búsqueda en Wikipedia
    Given Buscar "automatización" en "http://www.google.com"
    Then Acceder al resultado que corresponde a la web "Wikipedia"
    And Comprobar que el primer proceso automático se hizo sobre el año "300"
