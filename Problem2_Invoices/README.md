# Exercise 2 – Invoices

## Project Overview

This project implements an Invoice system for managing customer invoices. The invoice encapsulates customer details, invoice metadata, and a list of purchased items. It calculates VAT, applies discounts, and provides detailed invoice summaries.

## Features

#### Unique Invoice ID: 
Generated using UUID.randomUUID() to ensure uniqueness.

#### Invoice Dates:

- Invoice Date (issue date) set at creation.

- Due Date automatically set to 7 days after the invoice date.

#### Customer Class: 
Holds customer information such as name, email, and address.

#### Item Class: 
Represents items with attributes including number, name, price per unit, and quantity sold.

#### Item Management:

- Supports adding up to 10 items per invoice.

- Prevents adding more than 10 items.

#### Cost Calculations:

- Calculates total cost of all items.

- Computes VAT as 20% of total cost.

- Applies 10% discount if total cost exceeds 5000 ALL.

#### Detailed Invoice Output (overriding toString method):

- Customer details, itemized list with prices and quantities.

- Total cost before and after VAT and discounts.

- Shows VAT amount and applied discount.

## Usage

Create an invoice by specifying customer and invoice date, add items, calculate discounts, and print invoice details.

## Example:
````
Customer customer = new Customer("John Joel", "john.joel@domain.com", "Center Tirana");
Invoice invoice = new Invoice(customer, LocalDate.now());

invoice.addItems(new Item(1, "Laptop", 800.00, 1));
invoice.addItems(new Item(2, "Mouse", 20.00, 2));
invoice.calculateDiscount();

System.out.println(invoice);
````
## Sample Output:
````
Invoice ID: 123e4567-e89b-12d3-a456-426614174000
Invoice Date: 2025-08-14
Due Date: 2025-08-21

Customer Name: John Joel
Email: john.joel@domain.com
Address: Center Tirana.

Items:
Item Number: 1, Name: Laptop, Price: 800.00, Quantity Sold: 1
Item Number: 2, Name: Mouse, Price: 20.00, Quantity Sold: 2

otal Cost (before VAT): 840.00
VAT (20%): 168.00
Discount Applied: 0.00
Total Cost (after Discount): 1008.00
````