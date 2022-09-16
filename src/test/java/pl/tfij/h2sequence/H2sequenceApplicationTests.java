package pl.tfij.h2sequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class H2sequenceApplicationTests {

	@Autowired
	private SampleEntityRepository sampleEntityRepository;

	@Test
	void contextLoads() {
		List<SampleEntity> all = sampleEntityRepository.findAll();
		Assertions.assertTrue(all.isEmpty());
	}

}
