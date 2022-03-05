fun main(args: Array<String>) {

}

fun triangulo(): Unit{
    println("Digite o valor do primeiro lado:")
    val lado1 = readLine()!!.toFloat()
    println("Digite o valor do segundo lado:")
    val lado2 = readLine()!!.toFloat()
    println("Digite o valor do terceiro lado:")
    val lado3 = readLine()!!.toFloat()

    if(lado1 + lado2 < lado3)
        println("Os valores informados não formam um triângulo")
    else if(lado2 + lado3 < lado1)
        println("Os valores informados não formam um triângulo")
    else if(lado1 + lado3 < lado2)
        println("Os valores informados não formam um triângulo")
    else if(lado1 == lado2 && lado1 == lado3)
        println("O triângulo é equilátero")
    else if(lado1 == lado2 && lado1 != lado3)
        print("O triângulo é isóceles")
    else if(lado1 != lado2 && lado1 == lado3)
        println("O triângulo é isóceles")
    else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        println("O triângulo é escaleno")
}

fun anoBissexto(): Unit{
    println("Digite um ano qualquer para descobrir se é ano bissexto:")
    val ano = readLine()!!.toInt()
    if(ano % 4 == 0 && ano % 100 != 0) {
        println("O ano $ano é bissexto!!")
    } else if ( ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
        println("O ano $ano é bissexto!!")
    } else {
        println("O ano $ano não é bissexto")
    }
}

fun detetive(): Unit {
    println("Responda usando 0 ou 1 :\n1 = sim\n0 = não")
    println("Telefonou para a vítima?")
    val pergunta = readLine()!!.toInt()

    if (pergunta == 1)
    else if (pergunta == 0)
    else
        println("Resposta Invalida!!!")

    println("Esteve no local do crime?")
    val pergunta2 = readLine()!!.toInt()
    if (pergunta2 == 1)
    else if (pergunta2 == 0)
    else
        println("Reposta Invalida!!!")

    println("Mora perto da Vitima?")
    val pergunta3 = readLine()!!.toInt()
    if (pergunta3 == 1)
    else if (pergunta3 == 0)
    else
        println("Resposta invalida!!!")

    println("Devia para a vitima?")
    val pergunta4 = readLine()!!.toInt()
    if (pergunta4 == 1)
    else if (pergunta4 == 0)
    else
        println("Resposta Invalida!!!")

    println("Ja trabalhou com a vítima?")
    val pergunta5 = readLine()!!.toInt()

    if (pergunta5 == 1)
    else if (pergunta5 == 0)
    else
        println("Resposta Invalida")

    val media = (pergunta + pergunta2 + pergunta3 + pergunta4 + pergunta5)
    if (media <= 1)
        println("Você é Inocente!!!")
    else if (media == 2)
        println("Você é Suspeito(a)!!!")
    else if (media <= 4 )
        println("Voce é Cumplice!!!")
    else if (media == 5 )
        println("Voce é o assassino!!!")
    else
        println("Resposta inválida!!!")
}

fun posto(): Unit{
    println("Escolha sua forma de combustível\nG - gasolina\nA - Álcool")
    val combustivel = readLine()!!.toString()

    if (combustivel.equals("a",true)){
        println("Álcool")
    }else if (combustivel.equals("g",true)){
        println("Gasolina")
    }else{
        println("Erro")
    }

    println("Quantos litros de ${combustivel} deseja colocar?")
    val qnt = readLine()!!.toFloat()

    val costA = (qnt * 5.4)
    val costG = (qnt * 6.8)

    if (combustivel.equals("a",true) && qnt <= 20){
        println("O valor à ser pago é R$${costA - (costA * 0.03)}")
    }else if (combustivel.equals("a",true) && qnt > 20){
        println("O valor à ser pago é R$${costA - (costA * 0.05)}")
    }else if (combustivel.equals("g",true) && qnt <= 20){
        println("O valor à ser pago é R$${costG - (costG * 0.04)}")
    } else if(combustivel.equals("g",true) && qnt > 20){
        println("O valor à ser pago é R$${costG - (costG * 0.06)}")
    }
}