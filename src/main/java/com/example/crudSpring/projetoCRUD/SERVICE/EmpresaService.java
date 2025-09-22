package com.example.crudSpring.projetoCRUD.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {

  private final EmpresaRepository empresaRepository;
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
     //realizar a busca de dados no banco usando
     //o id criado da classe 
    public Optional<Empresa> buscarPorId(Long id){
      return empresaRepository.findById(id);
    }

    public Empresa editarDadoEmpresa(Long id, Empresa dadosAtualizados){
      
      Empresa empresaBuscada = buscarPorId(id).orElseThrow( 
        () -> new IllegalArgumentException("Empresa não encontrada"));

        empresaBuscada.setNome_empresa(dadosAtualizados.getNome_empresa());
        empresaBuscada.setCnpj(dadosAtualizados.getCnpj());
        empresaBuscada.setRamo(dadosAtualizados.getRamo());

        return empresaRepository.save(empresaBuscada);
    }
    public List<Empresa> buscarempresasporNome(String nome_empresa){
      return empresaRepository.findByNome_empresaContainingIgnoringCase(nome_empresa);
    }

}

