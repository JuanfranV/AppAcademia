package org.example.dao;

import org.example.model.categoriaModel;

public interface categoriaDAO {

    void crear (categoriaModel categoriaModel) throws Exception;
    categoriaModel leer (int id) throws Exception;
    void actualizar (categoriaModel categoriaModel) throws Exception;
    void eliminar (int id) throws Exception;
}
