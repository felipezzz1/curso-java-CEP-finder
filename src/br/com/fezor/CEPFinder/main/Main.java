package br.com.fezor.CEPFinder.main;

import br.com.fezor.CEPFinder.models.Address;
import br.com.fezor.CEPFinder.models.FileGenerator;
import br.com.fezor.CEPFinder.models.FindCep;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FindCep findCep = new FindCep();

        System.out.println("Please Type a CEP number to search: ");
        var cepInserted = input.nextLine();

        try{
            Address newAddress = findCep.findAddress(cepInserted);
            System.out.println(newAddress);
            FileGenerator fileGenerator = new FileGenerator();
            fileGenerator.saveJsonFile(newAddress);;
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Exiting...");
        }
    }
}
