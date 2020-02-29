package chela.springframework.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeFetcherImpl implements JokeFetcher{

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeFetcherImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getChuckNorrisQuote(){
		return chuckNorrisQuotes.getRandomQuote();
	}

}
