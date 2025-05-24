package org.example.dao;

import org.example.model.cursoUsuarioModel;

public interface cursoUsuarioDAO {

    void crear (cursoUsuarioModel cursoUsuarioModel);
    cursoUsuarioModel leer (int id);
    void actualizar (cursoUsuarioModel cursoUsuarioModel);
    void eliminar (int id);
}
