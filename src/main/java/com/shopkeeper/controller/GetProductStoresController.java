package com.shopkeeper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopkeeper.dto.StoreDto;

@Controller
public class GetProductStoresController {

	@PostMapping("/get-product-stores.htm")
	public String getAvailableProductStores(@RequestParam("productCode") String productCode, ModelMap model) {
		List<StoreDto> listStores = new ArrayList<StoreDto>();
		StoreDto storeDto1 = new StoreDto("SPG963", "Gayathri Fashions", "9696874523", "Ntr Circle,Madanapalli");
		listStores.add(storeDto1);
		StoreDto storeDto2 = new StoreDto("YGN918", "Yashu Fashion World", "9110383380", "RR Streat,Madanapalli");
		listStores.add(storeDto2);
		model.addAttribute("listStores", listStores);
		return "display-stores";
	}
}
