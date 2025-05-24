package org.example.dao;

import org.example.model.usuarioModel;

public interface usuarioDAO {

    void crear (usuarioModel usuarioModel);
    usuarioModel leer (int id);
    void actualizar (usuarioModel usuarioModel);
    void eliminar (int id);
}
