# CEPFinder

CEPFinder is a simple Java application designed to search for addresses using Brazilian postal codes (CEPs). It retrieves address information from the **ViaCEP API**, formats the results as JSON, and saves them to a local file.

## Features

- **Search for an Address:** Input a Brazilian CEP to retrieve address information.
- **API Integration:** Retrieves address data from the **ViaCEP API**.
- **File Output:** Saves the retrieved address in a JSON file, named after the provided CEP.

## Project Structure

The project consists of four main components:

1. **Main Class**  
   The entry point of the application. Prompts the user for a CEP, retrieves the address, and saves it as a JSON file.

2. **FindCep Class**  
   Queries the **ViaCEP API** using the provided CEP and retrieves the corresponding address information.

3. **Address Record**  
   Represents the structure of the address returned by the API, with fields such as `cep`, `logradouro`, `localidade`, and `uf`.

4. **FileGenerator Class**  
   Responsible for writing the address data to a JSON file using the **Gson** library.

## How It Works

1. **Input CEP:**  
   The user is prompted to enter a valid Brazilian CEP.

2. **API Request:**  
   The entered CEP is sent to the **ViaCEP API**, and the corresponding address information is retrieved.

3. **Save to File:**  
   The retrieved address is saved as a JSON file, named after the provided CEP (e.g., `01001000.json`).

## Prerequisites

- **Java 11** or higher.
- **Gson Library** for JSON parsing and formatting.

## Setup Instructions

1. **Clone the repository** or download the source files.
2. Ensure **Java** and **Gson** are properly installed in your development environment.
3. Run the `Main` class from your IDE or the command line.

## Example Usage

Upon running the application, it prompts for a CEP input:

```bash
Please type a CEP number to search:
(e.g) 01001000
