package org.example.dao;

import org.example.model.cursoModel;

public interface cursoDAO {

    void crear (cursoModel cursoModel);
    cursoModel leer (int id);
    void actualizar (cursoModel cursoModel);
    void eliminar (int id);
}
