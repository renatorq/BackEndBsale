package com.bsale.bsale.repository;

import com.bsale.bsale.entity.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(MockitoJUnitRunner.class)
public class CategoryRepositoryTest {

    @Mock
    private CategoryRepository categoryRepository;

    @Before
    public void setUp() {
    }

    @Test
    public void findAllCategory() {
        List<Category> listCategory = categoryRepository.findAllCategory();
        System.out.println(listCategory);
        assertNotNull(categoryRepository);
    }

    @Test
    public void testFindById(){
        Optional<Category> category = categoryRepository.findById(1L);
        System.out.println(category);
        assertNotNull(category);
    }

}