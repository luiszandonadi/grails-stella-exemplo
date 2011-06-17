package exemplo

class PessoaJuridica {

    String cnpj
    static constraints = {
        cnpj(cnpj:[formatted:true])

    }
}
