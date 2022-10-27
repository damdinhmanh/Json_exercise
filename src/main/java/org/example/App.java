package org.example;

import com.google.gson.Gson;

import java.util.*;

public class App 
{
    public static void ListAllProductBrand(List<Product> productList) {
        Set<String> brandList = new HashSet<String>();

        for (Product p : productList) {
            brandList.add(p.getBrand());
        }

        System.out.println("List Brands:");
        brandList.forEach(i -> System.out.println(i ));
    }

    public  static void ListCategoryAndNumberProduct(List<Product> productList) {
        Map<String, Integer> categoryMap = new HashMap<String, Integer>();

        for (Product p : productList) {

            for (String cg : p.getCategory()) {
                if (categoryMap.containsKey(cg)) {
                    categoryMap.put(cg, categoryMap.get(cg) + 1);
                } else {
                    categoryMap.put(cg, 1);
                }

            }
        }

        System.out.printf("\n\nList categories - numbers: \n");

        categoryMap.forEach((K, V) -> {
           System.out.println("Category: " + K + " - number: " + V);
        });
    }


    public static void main( String[] args )
    {

        ProductService productService = new ProductService();
        List<Product> listProduct = productService.getAllProducts();

        //Liệt kê tất cả các hãng sản phẩm (Sử dụng Set)
        ListAllProductBrand(listProduct);

        //Liệt kê Danh mục sản phẩm(Category) và số lượng sản phẩm thuộc danh mục đó (Map)
        ListCategoryAndNumberProduct(listProduct);


    }
}
