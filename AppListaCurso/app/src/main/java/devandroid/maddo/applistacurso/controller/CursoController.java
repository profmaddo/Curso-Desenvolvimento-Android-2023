package devandroid.maddo.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.maddo.applistacurso.model.Curso;

public class CursoController {
    public List listCursos;

    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso()); // Java
        listCursos.add(new Curso()); // HTML
        listCursos.add(new Curso()); // C#
        listCursos.add(new Curso()); // Python
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());

        return listCursos;
    }
}
