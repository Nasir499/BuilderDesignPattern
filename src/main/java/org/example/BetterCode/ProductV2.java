package org.example.BetterCode;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ProductV2 {

        private  String name;

        private  String description;

        private  String brand;

        private int price;

        private String category;

        private  int discount;

        private String createdAt;

        private  String  updatedAt;

        private List<String> images;

        ProductV2(HashMap<String, Objects> mp) {

            if(mp.get("price").equals(0)){
//                this.price=mp.get("price");
            }
        }

    }


