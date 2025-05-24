package org.example.dao;

import org.example.model.credencialModel;

public interface credencialDAO {

    void crear (credencialModel credencialModel);
    credencialModel leer (int id);
    void actualizar (credencialModel credencialModel);
    void eliminar (int id);
}
