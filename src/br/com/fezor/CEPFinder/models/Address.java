package br.com.fezor.CEPFinder.models;

public record Address(String cep, String logradouro,
                      String localidade, String uf) {
}
