package br.com.radaction;

public class Relogio {

	/**
	 * O objetivo do é passar as horas e segundos(int) e retornar um string no
	 * formato convecional
	 * 
	 * @param hora
	 *            Total de Horas em segundos
	 * @return hora no formato convecional 00:00:00
	 */
	public String mostraHora(int hora) {
		int minutos = hora / 60;
		int segundos = hora % 60;
		int horas = minutos / 60;
		int min = minutos % 60;
		String strMinuto;
		if (min < 10) {
			strMinuto = "0" + min;
		} else {
			strMinuto = "" + min;
		}
		String strSegundos;
		if (segundos < 10) {
			strSegundos = "0" + segundos;
		} else {
			strSegundos = "" + segundos;
		}

		return horas + ":" + strMinuto + ":" + strSegundos;

	}

}