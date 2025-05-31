package org.example.dao;

import org.example.model.cursoModel;

public interface cursoDAO {

    void crear (cursoModel cursoModel) throws Exception;
    cursoModel leer (int id) throws Exception;
    void actualizar (cursoModel cursoModel) throws Exception;
    void eliminar (int id) throws Exception;
}
