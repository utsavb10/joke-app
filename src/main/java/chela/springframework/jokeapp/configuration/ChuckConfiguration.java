package chela.springframework.jokeapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

//	Bean added to tell that the object is now returned as a Bean
	@Bean
	public ChuckNorrisQuotes getChuckNorrisQuotesClassConfig(){
		return new ChuckNorrisQuotes();
	}
}
