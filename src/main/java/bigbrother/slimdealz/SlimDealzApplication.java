package bigbrother.slimdealz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class SlimDealzApplication {
    public static void main(String[] args) {
        SpringApplication.run(SlimDealzApplication.class, args);
    }
}
