package com.tronicmart.tronicmart.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductDto {
    private int Productid;
    private String ProductName;
    private String Description;
    private Float Price;
    private byte[] Img;
}
