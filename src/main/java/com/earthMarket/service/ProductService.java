package com.earthMarket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.earthMarket.vo.ProductVO;

@Service
public class ProductService {
	
	public List<ProductVO> getProductList() {
		ProductVO pv = new ProductVO();
		List<ProductVO> list = new ArrayList<ProductVO>();
		
		//임시데이터
		for(int i = 1; i < 21; i++) {
			pv.setNum(i);
			pv.setPhoto("../../assets/image/board/sample01.jpg");
			pv.setTag("달콤팜" + i);
			pv.setTit("새콤달콤 설향딸기" + i);
			pv.setPrice("42,000");
			list.add(pv);
		}
		
		return list; 
	}
}
