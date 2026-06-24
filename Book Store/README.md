This task aims to implement a simple bookstore management system in Java.

First, create a class called `Book` to store basic information about a book. This information should include the book title, author name, translator name, publisher name, publication year, and ISBN. The class will only have a constructor and no additional operations.

Next, create a class called `AvailableBooks` that inherits the basic book information from the `Book` class. Additionally, this class should include fields for the book ID (`BookID`), the date the book was added to the bookstore, the purchase price, the sale price (`Price`), and the number of books in stock. 

This class will have the following operations:
- A constructor function that initializes all fields.
- A function called `getInput` that prompts the user for all the book information.
- A function to print all the information about a book.

Then, create a class called `Store` for the bookstore. The most important member of this class is an array of `AvailableBooks` objects, with a maximum length of 1000, referred to as `booksList`. There is also an integer `n` (where n ≤ 1000) representing the number of book titles stored in the array.

The `Store` class will have the following operations:
- A constructor function that initializes all fields.
- A function that returns the number of books in stock for a specific book ID.
- A function that saves all the information about the books stored in the array to a file.
- A function called `Sale(bid, num)` that subtracts `num` from the stock of a book identified by the book ID (`bid`). If the stock is insufficient, the function should issue an appropriate message.
- A function called `changePrice(bid, price)` that updates the selling price of the book with the specified book ID to the new amount.
- A function that receives information about a new book title from the user and adds it to the array.
- A function called `getInfo` that gathers all the information about the books from the user. This function first receives the integer `n`, followed by the information for `n` books from the input.