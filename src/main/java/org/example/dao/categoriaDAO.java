package org.example.dao;

import org.example.model.categoriaModel;

public interface categoriaDAO {

    void crear (categoriaModel categoriaModel);
    categoriaModel leer (int id);
    void actualizar (categoriaModel categoriaModel);
    void eliminar (int id);
}
