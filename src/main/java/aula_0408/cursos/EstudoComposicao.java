package aula_0408.cursos;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Henrique","123456X");
        Aluno aluno2 = new Aluno("Luana","123456Y");
        Aluno aluno3 = new Aluno("Arthur","123456Z");

        List<Aluno> alunos = new ArrayList<>(List.of(aluno1,aluno2,aluno3));

        Professor professor = new Professor("Gabriel", "12345678-9");

        Curso curso = new Curso("Java Full Stack",200.0F,professor,alunos);
        System.out.println(curso);
    }

}
