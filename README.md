# Projeto de Design Patterns

Esse projeto é um exemplo de um simples "serviço" com Spring para retornar um produto mockado.

## Quais patterns estão no projeto?

### Singleton
Todos `Beans` do Spring são Singletons, ou seja, instâncias que são compartilhadas globalmente.

### Service
Utilizado geralmente para incorporar Regras de Negócios internamente.

### Controller
Utilizado para controlar a entrada e saída de dados via REST.

## Testando 

### Endpoint /products
Listará 2 produtos utilizando HTTP/GET.

```curl
curl --location '127.0.0.1:8080/products'
```