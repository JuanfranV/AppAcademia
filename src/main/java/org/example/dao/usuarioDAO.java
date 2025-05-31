package org.example.dao;

import org.example.model.usuarioModel;

public interface usuarioDAO {

    void crear (usuarioModel usuarioModel) throws Exception;
    usuarioModel leer (int id) throws Exception;
    void actualizar (usuarioModel usuarioModel) throws Exception;
    void eliminar (int id) throws Exception;
}
