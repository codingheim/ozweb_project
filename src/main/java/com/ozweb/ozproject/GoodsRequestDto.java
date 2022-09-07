package com.ozweb.ozproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsRequestDto {

  private String storename;
  private String title;
  private Long mincount;
  private Long price;
}
