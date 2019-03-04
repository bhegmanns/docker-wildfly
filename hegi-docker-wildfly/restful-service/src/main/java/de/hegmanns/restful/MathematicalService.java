package de.hegmanns.restful;

import java.math.BigDecimal;
import java.util.Optional;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Stateless
@Path("/math")
public class MathematicalService {

	@GET
	@Path("/add/{first}/{second}")
	public String add( @PathParam("first") String firstValue, @PathParam("second") String secondValue) {
		Optional<BigDecimal> first = parse(firstValue);
		Optional<BigDecimal> second = parse(secondValue);
		
		Optional<BigDecimal> result = Optional.empty();
		if (first.isPresent() && second.isPresent()) {
			result = Optional.of(first.get().add(second.get()));
		}
		
		return result.flatMap( b -> Optional.ofNullable(b.toPlainString())).orElse("");
	}
	
	private Optional<BigDecimal> parse(String valueAsString){
		BigDecimal value = null;
		
		try {
			value = new BigDecimal(valueAsString);
		} catch (Exception e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		return Optional.ofNullable(value);
		
	}
}
