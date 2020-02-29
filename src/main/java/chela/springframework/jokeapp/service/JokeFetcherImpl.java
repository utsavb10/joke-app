package chela.springframework.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeFetcherImpl implements JokeFetcher{

	private final ChuckNorrisQuotes chuckNorrisQuotes;

//	Add chuckNorris here
//	public JokeFetcherImpl() {
//		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//	}

	// Load chuckNorris class in a configuration class separately
	public JokeFetcherImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getChuckNorrisQuote(){
		return chuckNorrisQuotes.getRandomQuote();
	}

}
