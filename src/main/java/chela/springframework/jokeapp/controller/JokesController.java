package chela.springframework.jokeapp.controller;

import chela.springframework.jokeapp.service.JokeFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

	private final JokeFetcher jokeFetcher;

	public JokesController(JokeFetcher jokeFetcher) {
		this.jokeFetcher = jokeFetcher;
	}

	@RequestMapping("/")
	String getJoke(Model model){
		String joke = jokeFetcher.getChuckNorrisQuote();

		return "Joke";
	}
}
