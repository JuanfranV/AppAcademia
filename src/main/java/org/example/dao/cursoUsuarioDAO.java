package org.example.dao;

import org.example.model.cursoUsuarioModel;

public interface cursoUsuarioDAO {

    void crear (cursoUsuarioModel cursoUsuarioModel) throws Exception;
    cursoUsuarioModel leer (int id) throws Exception;
    void actualizar (cursoUsuarioModel cursoUsuarioModel) throws Exception;
    void eliminar (int id) throws Exception;
}
