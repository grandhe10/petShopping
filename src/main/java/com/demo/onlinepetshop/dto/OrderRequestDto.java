package com.demo.onlinepetshop.dto;

import java.util.List;

/**
 * @author Suma
 * Generates class with parameter as list of petDtos
 *
 */
public class OrderRequestDto {

	private List<PetDto> petDtoList;

	public List<PetDto> getPetDtoList() {
		return petDtoList;
	}

	public void setPetDtoList(List<PetDto> petDtoList) {
		this.petDtoList = petDtoList;
	}
}
