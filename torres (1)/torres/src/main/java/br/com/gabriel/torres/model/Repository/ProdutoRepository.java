    package br.com.gabriel.torres.model.Repository;

    import br.com.gabriel.torres.Produto;
    import org.springframework.data.repository.CrudRepositoryExtensionsKt;
    import org.springframework.data.repository.CrudRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface ProdutoRepository extends CrudRepository<Produto, Integer>  {
    }
