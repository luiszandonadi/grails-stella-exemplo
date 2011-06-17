package exemplo

class PessoaFisica {
    String cpf
        static constraints = {
            cpf(cpf:[formatted:true])

        }
}
