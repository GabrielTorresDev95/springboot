package br.com.gabriel.torres.Controllers;


import br.com.gabriel.torres.Produto;
import br.com.gabriel.torres.model.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/produto", method = RequestMethod.POST)
public class ProdutoControllers {

    @Autowired
    private ProdutoRepository prodRep;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome) {
        Produto prod = new Produto();
        System.out.println("Teste");
        prodRep.save(prod);
        return prod;
    }

}
