package it.epicode.be.godfather.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PizzaBuild {

	private String nome;
	private Double prezzo;
	private Double calorie;

}