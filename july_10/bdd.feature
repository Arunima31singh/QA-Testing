Feature: Covered Ecom Application

1. Scenario: Customer Registration

Given the user navigates to the Registration page

When they submit accurate registration credentials

And select the "Register" option

Then a new profile must be generated successfully

And a welcome confirmation notification should appear

2. Scenario: Customer Login

Given the user navigates to the Login page

When they provide a valid username and corresponding password

And click the "Login" control

Then access should be granted to the account

And the system should direct them to the main dashboard

3. Scenario: Search for a Product

Given the user navigates to the Home page

When they type an existing item name into the search field

And execute the search command

Then the platform should return a list of relevant matching items

4. Scenario: View Product Details

Given the user is on the products page

When they select a specific item

Then the system should open the item's dedicated page

And details such as title, pricing, overview text, and media must be visible

5. Scenario: Add Product to Cart

Given the user is on the product details page

When they choose the "Add to Cart" option

Then the selected merchandise should transfer to their shopping basket

And the mini-cart counter should reflect the new addition

6. Scenario: Update Product Quantity in Cart

Given the user has a product in the cart

When they adjust the quantity value for an item

And apply the updated amount

Then the basket must showcase the revised item count

And the overall order subtotal should recalculate accordingly

7. Scenario: Remove Product from Cart

Given the user has a product in the cart

When they select the "Remove" action next to that item

Then the piece of merchandise should be cleared from the basket

And the cart summary must refresh instantly

8. Scenario: Add Product to Wishlist

Given the user is viewing a product

When they tap the "Add to Wishlist" heart icon

Then the item should be successfully saved to their favorites list

And an alert should verify the action was successful

9. Scenario: Successful Checkout

Given the user has products in the cart

When they initiate the checkout sequence

And input standard, valid delivery information

Then the system should securely progress to the final steps

And display a breakdown of the pending purchase

10. Scenario: Successful Payment

Given the user is on the payment page

When they provide legitimate billing details

And submit the authorization request

Then the transaction should clear without error

And a payment approval notification must be shown

11. Scenario: View Order Confirmation

Given the user has completed a successful payment

When the transaction processing concludes

And a unique tracking invoice number is created

Then the application must present a formal success landing page

12. Scenario: View Order History

Given the user is logged into the application

When they open their personal "Order History" section

Then a log of all prior transactions should load

And individual receipt breakdowns must be accessible

13. Scenario: Successful Logout

Given the user is logged into the application

When they trigger the "Logout" option

Then the active session should safely terminate

And the application should redirect them back to the sign-in portal