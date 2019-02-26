package com.imooc.sell.controller;

import com.imooc.sell.VO.ProductInfoVo;
import com.imooc.sell.VO.ProductVO;
import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.service.CategoryService;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 买家商品
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){

        //查询所有上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //在所有上架的商品里查询类目
        List<Integer> categoryTypeList = new ArrayList<>();



        ResultVO resultVo = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVo productInfoVo = new ProductInfoVo();

        productVO.setProductInfoVoList(Arrays.asList(productInfoVo));
        resultVo.setData(Arrays.asList(productVO));
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

}
