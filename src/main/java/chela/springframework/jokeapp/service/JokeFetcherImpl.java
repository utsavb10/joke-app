package chela.springframework.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeFetcherImpl implements JokeFetcher{

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeFetcherImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getChuckNorrisQuote(){
		return chuckNorrisQuotes.getRandomQuote();
	}

}
