package br.com.romariodev.api.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilitarios {
	public String pegaPrimeiroNome(String nome){
		String[] split = nome.split(" ");
		String ultimoNome = split[split.length - 1];
		  String pattern = "\\S+";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(nome);
		  m.find();
		  if(m.group(0) == ultimoNome)
			  return m.group(0);
		  else
			  return m.group(0)+" "+ultimoNome;
	}
}
