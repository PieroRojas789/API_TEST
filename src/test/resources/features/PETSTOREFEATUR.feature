Feature: Funcionalidad del API PET STORE

  @Consulta1
  Scenario Outline: Creación de nueva Order con metodo POST
    When creo el pedido '<id>' con el id mascota '<petID>' de la mascota
    Then la respuesta debe contener un codigo de estatus <requestCode>
    And el tipo debe ser '<tipo>'

    Examples:
      | id | petID | requestCode | tipo   |
      | 21 | 58    | 200         | placed |
      | 22 | 59    | 200         | placed |

  @Consulta2
  Scenario Outline: Consulta de una Order en tienda usando metodo GET
    When consulto el '<id>' de la order
    Then la respuesta debe ser <requestCode>
    And tipo debe ser <quantity>

    Examples:
      | id | requestCode | quantity |
      | 21 | 200         | 1        |
      | 22 | 200         | 5        |
