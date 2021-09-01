import org.apache.log4j.BasicConfigurator;
import ua.lviv.lgs.domain.Bucket;
import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.BucketService;
import ua.lviv.lgs.service.ProductService;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.BucketServiceImpl;
import ua.lviv.lgs.service.impl.ProductServiceImpl;
import ua.lviv.lgs.service.impl.UserServiceImpl;

import java.util.Date;

public class main {
    public static void main(String[] args) {

        BasicConfigurator.configure();
         UserService userService = UserServiceImpl.getUserService();
        userService.create(new User("HP34@gmail.com","TOm", "Marvolo", "Redl", "3345" ));

        ProductService productService = ProductServiceImpl.getProductService();
        productService.create(new Product("name", "descript", 25.4));

        BucketService bucketService = BucketServiceImpl.getBucketService();
        bucketService.create(new Bucket(1,6,new Date()));
    }
}
