package com.example.crudSpring.projetoCRUD.SERVICE;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {
    //metodo construtor da classe EmpresaServise
    //criando uma ligação com a Classe empresaRepository
    public EmpresaService(EmpresaRepository oempresaRepository){

      oempresaRepository = oempresaRepository;

 }
 

  
}
