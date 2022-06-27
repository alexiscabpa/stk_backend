package com.stk.consultas.repositories;
import org.springframework.stereotype.Repository;
import com.stk.consultas.models.*;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer>{
    
    public abstract ArrayList<UsuarioModel> findByPrivilegios(Integer privileigios);
}
