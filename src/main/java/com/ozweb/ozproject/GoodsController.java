package com.ozweb.ozproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GoodsController {

  private final GoodsRepository goodsRepository;
  private final GoodsSerivce goodsSerivce;

  @PostMapping("/api/goods")
  public Goods createGoods(@RequestBody GoodsRequestDto requestDto) {
    Goods goods = new Goods(requestDto);
    return goodsRepository.save(goods);
  }

  @GetMapping("/api/goods")
  public List<Goods> getGoods() {
    return goodsRepository.findAll();
  }

  @PutMapping("/api/goods/{id}")
  public Long updateGoods(@PathVariable Long id, @RequestBody GoodsRequestDto requestDto) {
    goodsSerivce.update(id,requestDto);
    return id;
  }

  @DeleteMapping("/api/goods/{id}")
  public Long deleteGoods(@PathVariable Long id) {
    goodsRepository.deleteById(id);
    return id;
  }
}
