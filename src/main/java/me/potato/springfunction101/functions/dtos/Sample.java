package me.potato.springfunction101.functions.dtos;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

/**
 * @author dongju.paek
 */
@Getter
@Setter
public class Sample {
	private final String name;

	public Sample(String name) {
		this.name = name;
		createAt = ZonedDateTime.now();
	}

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private ZonedDateTime createAt;
}