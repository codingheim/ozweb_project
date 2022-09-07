package com.ozweb.ozproject;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Goods extends Timestamped{

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;

  @Column(nullable = false)
  private String storename;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private Long mincount;

  @Column(nullable = false)
  private Long price;

  //private String bookmark;

  public Goods(GoodsRequestDto requestDto) {
    this.storename = requestDto.getStorename();
    this.title = requestDto.getTitle();
    this.mincount = requestDto.getMincount();
    this.price = requestDto.getPrice();
  }


  public void update(GoodsRequestDto requestDto) {
    this.storename = requestDto.getStorename();
    this.title = requestDto.getTitle();
    this.mincount = requestDto.getMincount();
    this.price = requestDto.getPrice();
  }


}
