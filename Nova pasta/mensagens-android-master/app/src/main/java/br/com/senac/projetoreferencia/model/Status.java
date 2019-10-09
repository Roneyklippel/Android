package br.com.senac.projetoreferencia.model;

public enum Status {
    ENVIADA{
        @Override
        public String toString() { return "Enviada"; }
    },
    NAOENVIADA{
        @Override
        public String toString() { return "Não Enviada"; }
    }
}