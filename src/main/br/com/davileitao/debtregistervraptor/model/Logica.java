package br.com.davileitao.debtregistervraptor.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

	void executa(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
