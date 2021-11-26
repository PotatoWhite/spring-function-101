
package me.potato.springfunction101.functions;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import me.potato.springfunction101.functions.dtos.Sample;
import reactor.core.publisher.Flux;

/**
 * @author dongju.paek
 */
@Component
public class SampleFunctions {

	// processor
	@Bean
	public Function<Flux<String>, Flux<Sample>> create() {
		return flux -> flux.map(Sample::new);
	}


	// processor
	@Bean
	public Function<Flux<Sample>, Flux<String>> extract() {
		return flux -> flux.map(Sample::getName);
	}
}