CEPFinder
CEPFinder is a simple Java application designed to search for addresses using Brazilian postal codes (CEPs). It retrieves address information from the ViaCEP API, formats the results as JSON, and saves them into a local file.

Features
Search for an address using a CEP.
Retrieves address data from the ViaCEP API.
Saves the address in a JSON file named after the provided CEP.
Project Structure
The project consists of the following components:

1. Main Class
   The main entry point of the application. It prompts the user for a CEP, finds the corresponding address, and saves it in a JSON file.

2. FindCep Class
   Responsible for querying the ViaCEP API and retrieving the address based on the inputted CEP.

3. Address Record
   Represents the address structure retrieved from the API. Contains fields like cep, logradouro, localidade, and uf.

4. FileGenerator Class
   Handles writing the address data to a JSON file using the Gson library.

How It Works
Input CEP: The user is prompted to enter a valid Brazilian CEP.
API Request: The entered CEP is sent to the ViaCEP API, which returns the corresponding address.
Save to File: The address is saved as a JSON file named after the CEP (e.g., 01001000.json).
Prerequisites
Java 11 or higher
Gson library (for JSON parsing and formatting)
Setup Instructions
Clone the repository or download the source files.
Ensure Java and Gson are properly installed in your development environment.
Run the Main class in your IDE or command line.

Error Handling
If the provided CEP is invalid or the API cannot be reached, an exception will be thrown, and an error message will be displayed to the user.
Acknowledgments
ViaCEP API for providing address data.