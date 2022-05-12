package com.projeto_tads.controller;

import com.projeto_tads.model.Shopping;
import com.projeto_tads.service.ShoppingService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping")
public class ShoppingController {
  @Autowired
  ShoppingService shoppingService;

  @PostMapping("/")
  public String save(@ModelAttribute("shopping") Shopping shopping) {
    shoppingService.save(shopping);
    return "redirect:/shopping/";
  }

  @GetMapping("/")
  public String locAll(Model model) {
    List<Shopping> shopping = shoppingService.getShopping();
    model.addAttribute("shopping", shopping);
    return "index";
  }

  @GetMapping("/cadastrar")
  public String newShopping(Model model) {
    model.addAttribute("shopping", new Shopping());
    return "cadastrar";
  }

  @GetMapping("/remove/{id}")
  public String deleteShopping(@PathVariable("id") Long id) {
    shoppingService.deleteById(id);
    return "redirect:/shopping/";
  }

  // para chamar a pagina de edit-student.html
  @GetMapping("/edit/{id}")
  public String editShopping(@PathVariable("id") Long id, Model model) {
    Shopping shopping = shoppingService.findById(id);
    model.addAttribute("shopping", shopping);
    return "edit-shopping";
  }

  //aqui chama a função para dar uptade no aluno vulgo editar
  @PostMapping("/update/{id}")
  public String updateShopping(
    @PathVariable("id") Long id,
    @ModelAttribute Shopping shopping
  ) {
    shoppingService.save(shopping);

    return "redirect:/shopping/";
  }
}
