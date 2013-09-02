package br.com.radaction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.radaction.Relogio;

public class RelogioTest {

	@Test
	public void testMostaRelogio() {
		Relogio r=new Relogio();
		String hora=r.mostraHora(82800);
		assertEquals(hora, "23:00:00");
	}

}
