package com.example.crudSpring.projetoCRUD.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.SERVICE.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/empresaCTR")

public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService ligcaoEmpresaService) {
        this.empresaService = ligcaoEmpresaService;
    }
    
    @GetMapping("/viewCadEmpresa")
    public String mostrarForCadastro(Model oModel) {
        oModel.addAttribute("empresa", new Empresa());
        return "cadastroEmpresa";

    }
    
    }
    
    

