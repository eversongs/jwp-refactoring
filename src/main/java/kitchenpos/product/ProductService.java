package kitchenpos.product;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product create(final Product product) {
        product.checkValidation();
        return productRepository.save(product);
    }

    public List<Product> list() {
        return productRepository.findAll();
    }

}
