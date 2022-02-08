package com.loiane.cursojava.aula65;

@interface InformacaoAula {

	String autor();
	
	int numeroAulas();
	
	String site() default "http://loiane.training";
	
	
}
