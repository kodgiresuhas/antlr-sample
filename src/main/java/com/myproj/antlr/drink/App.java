package com.myproj.antlr.drink;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.myproj.antlr.drink.generated.DrinkLexer;
import com.myproj.antlr.drink.generated.DrinkParser;
import com.myproj.antlr.drink.generated.DrinkParser.DrinkSentenceContext;

public class App {

	public static void main(String[] args) {
		new App().printDrink("a cup of milk in India");
	}

	private void printDrink(String drinkSentence) {
		// Get our lexer
		DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream(drinkSentence));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		DrinkParser parser = new DrinkParser(tokens);

		// Specify our entry point
		DrinkSentenceContext drinkSentenceContext = parser.drinkSentence();

		// Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrDrinkListener listener = new AntlrDrinkListener();
		walker.walk(listener, drinkSentenceContext);
	}
}
