Feature: Women Category Page Test.
  As user I want to Test Women category page

  Scenario: Verify user should navigate to women category page successfully
    Given    User should in home page
    When     User click on women tab
    Then    User can see "WOMEN" text

  @smoke
  Scenario Outline: Verify user should add product to the cart successfully
    Given    User should in home page
    When     User click on women tab
    And     User click on "<product>" from product
    And     User click on "<qty>" from qty
    And     User click on "<size>" from size
    And     User click on "<colour>" from colour
    And     User click on add to cart button
    Then    User can see message"Product successfully added to your shopping cart"product added
    And     User close popup window
    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |

