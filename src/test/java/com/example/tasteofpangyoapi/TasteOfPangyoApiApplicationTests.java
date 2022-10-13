package com.example.tasteofpangyoapi;

import com.example.tasteofpangyoapi.domain.categorytb.CategoryRepository;
import com.example.tasteofpangyoapi.domain.categorytb.CategoryRepositoryImpl;
import com.example.tasteofpangyoapi.domain.categorytb.CategoryTb;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TasteOfPangyoApiApplicationTests {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryRepositoryImpl categoryRepositoryImpl;

	@Test
	void contextLoads() {
		long categoryId = 1L;
		String categoryName = "한식";


		categoryRepository.save(new CategoryTb(categoryId, categoryName));

		List<CategoryTb> result = categoryRepositoryImpl.findById(categoryId);

//		assertThat(result.size(), is(1));

	}

}
