package com.example.crudSpring.projetoCRUD.SERVICE;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {

  private EmpresaRepository empresaRepository;
    //metodo construtor da classe EmpresaServise
    //criando uma ligação com a Classe empresaRepository
    public EmpresaService(EmpresaRepository ligacaEmpresaRepository){

      empresaRepository = ligacaEmpresaRepository;

      //SELECTS OU Inserts ou ALTER TABLE OU DELETE

      //SELECT * FROM EMPRESA (SELECT REALIZA LISTAGEM DE DADOS)
      //WARE NAME _ EMPRESA = ? ( SELECT REALIZA LISTAGEM DE DADOS)
      //RETORNA TODOS OS DADOS DA TABELA EMPRESA (* - REPRESENTA TUDO DA TABELA)
      // 1SELECT 2( QUAIS OS DADOS VC DESEJA LISTAR)-3 SEMPRE ACONPANHADA DO FROM(ONDE DESEJA EXECUTAR O COMANDO)
    }

    public List<Empresa> findAll() {
      return empresaRepository.findAll();
      //select * from empresa
    }

    public Empresa cadastrarEmpresa(Empresa dadosEmpresa){
       return empresaRepository.save(dadosEmpresa);
    }  

    public void deletarEmpresa(Empresa dadosEmpresa){
      empresaRepository.delete(dadosEmpresa);
    }
    
      
}
