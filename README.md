# exercicio-cantina

Criar um algoritmo que consiga capturar pedido de massa em uma Cantina. 
Lembrando que esse algoritmo irá atender ao atendente e não a um cliente diretamente.

Regras e sugestões:

1) Criar uma classe Cliente, sendo que esta classe conterá o atributo nome.

2) Criar uma classe Ingrediente, sendo que esta classe conterá o atributo nome.
Os nomes de ingredientes podem ser exemplo: Bacon, mussarela, tomate e outros.

3) Criar uma classe Massa, sendo que esta classe conterá os atributos tipo e valor.
Os tipos podem ser exemplo: Penne, espaguete, ravioli e outros.
   
4) Criar uma classe Pedido, sendo que esta classe irá conter um objeto para massa, uma para cliente e uma lista de Ingredientes;
    A classe pedido irá conter um método que calcula o valor do pedido.

A Cantina será a classe que terá um método main, sendo assim será de onde irá começar as interações com o usuário.
A interação com o usuário será feita via JOptionPane e deverá ser informado os dados:

Informe o nome do cliente:
Informe o nome da massa:
Informe o valor da massa:

Informe os ingredientes escolhidos: (Exibir a tela até o usuário escolher a opção 5)
1-Bacon
2-Mussarela
3-Tomate
4-Queijo
5-Sair

*Cada ingrediente será acréscimo de 2 reais.

Ao final, exibir uma mensagem para o usuário informando os dados do pedido:
Ex: Pedido feito para Rafaela
    Penne com Bacon e Mussarela
    Valor: 15,00

Obs: Lembrar de criar os objetos necessários no main.
