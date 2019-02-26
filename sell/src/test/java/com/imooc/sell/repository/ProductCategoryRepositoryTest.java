package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = repository.findOne(1);
        productCategory.setCategoryType(1);
        repository.save(productCategory);
    }

    @Test
    public void findByType(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> productCategoryList = repository.findByCategoryTypeIn(list);
        Assert.assertNotNull(productCategoryList);
    }


}