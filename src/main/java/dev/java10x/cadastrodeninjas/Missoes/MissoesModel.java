package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;
    private String dificuldade;

    //@OneToMany Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")

    private List<NinjaModel> ninjas;

}
