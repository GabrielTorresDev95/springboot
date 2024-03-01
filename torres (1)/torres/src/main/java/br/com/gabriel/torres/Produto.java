package br.com.gabriel.torres;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.annotation.Id;

@Entity
public class Produto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int Id;
        private String nome;

        public Produto() {

        }

        public Produto(String nome) {
        super();
        this.nome = nome;
        }

        public int getId() {
                return Id;
        }

        public void setId(int id) {
                Id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }





}
