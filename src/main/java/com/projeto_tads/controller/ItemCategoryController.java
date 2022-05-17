package com.projeto_tads.controller;

import java.util.Optional;
import java.util.UUID;

import com.projeto_tads.model.ItemCategory;
import com.projeto_tads.service.ItemCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/itemcategory")
public class ItemCategoryController {
    @Autowired
    private ItemCategoryService service;

    // metodo para criar categoria do item

    @GetMapping("/cadastrar")
    public String newItemCategory(Model model) {
        model.addAttribute("Itemcategory", new ItemCategory());
        return "addcategory";
    }

    // metodo para editar categoria do item

    @GetMapping("/edit/{id}")
    public String edititemcategory(@PathVariable("id") UUID id, Model model) {
        ItemCategory itemcategory = service.findById(id);
        model.addAttribute("itemCategory", itemcategory);
        return "editarProf";
    }

    // metodo para deletar a categoria do item
    @GetMapping("/delete/{id}")
    public String deleteItemCategory(@PathVariable("id") UUID id) {
        var student = service.findById(id);
        service.deleteItemCategory(student.get());

        return "redirect:";
    }
}
