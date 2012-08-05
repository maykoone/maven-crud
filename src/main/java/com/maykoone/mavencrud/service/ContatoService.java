/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.service;

import com.maykoone.mavencrud.entidade.Contato;
import java.util.List;

public interface ContatoService {

    public abstract Contato save(Contato contato);

    public abstract void remove(Contato contato);

    public abstract Contato findById(Long id);

    public abstract List<Contato> list();
}
