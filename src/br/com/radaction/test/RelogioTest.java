package br.com.radaction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.radaction.Relogio;

public class RelogioTest {

	@Test
	public void test() {
		Relogio r=new Relogio();
		String hora=r.mostraHora(1234);
		assertEquals(hora, "00:00:00");
	}

}
