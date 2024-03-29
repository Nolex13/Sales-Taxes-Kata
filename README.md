# Sales-Taxes-Kata

[![Build Status](https://travis-ci.org/Nolex13/Sales-Taxes-Kata.svg?branch=master)](https://travis-ci.org/Nolex13/Sales-Taxes-Kata)

This problem requires some kind of input. You are free to implement any mechanism for feeding
input into your solution (for example, using hard coded data within a unit test). You should
provide sufficient evidence that your solution is complete by, as a minimum, indicating that it
works correctly against the supplied test data.
The goal is to provide us with a full understanding of your coding style and skills. We’ll pay
particular attention to:

- the code structure
- the design
- choice of data structures
- how you approach the problem

We kindly ask you to put your code on a public project in github.com under your account, use
Maven (or Gradle or another build tool) as automation tool and link it to a build service like Travis
CI.

## PROBLEM: SALES TAXES

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical
products that are exempt. Import duty is an additional sales tax applicable on all imported goods
at a rate of 5%, with no exemptions.
When I purchase items I receive a receipt which lists the name of all the items and their price
(including tax), finishing with the total cost of the items, and the total amounts of sales taxes
paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains
(np/100 rounded up to the nearest 0.05) amount of sales tax.
Write an application that prints out the receipt details for these shopping baskets...
