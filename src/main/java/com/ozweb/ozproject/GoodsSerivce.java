package com.ozweb.ozproject;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class GoodsSerivce {

  private final GoodsRepository goodsRepository;

  @Transactional
  public Long update(Long id, GoodsRequestDto requestDto) {
    Goods goods = goodsRepository.findById(id).orElseThrow(
            () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
    );
    goods.update(requestDto);
    return goods.getId();
  }
}
