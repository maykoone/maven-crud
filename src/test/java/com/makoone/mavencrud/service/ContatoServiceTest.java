/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makoone.mavencrud.service;

import com.maykoone.mavencrud.entidade.Contato;
import com.maykoone.mavencrud.service.ContatoService;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContatoServiceTest {

    ApplicationContext ctx;
    ContatoService service;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(
                "classpath:META-INF/application-context.xml");
        service = (ContatoService) ctx.getBean("contatoService");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void testSave() {
        Contato contato = new Contato();
        contato.setNome("contato");
        contato.setEmail("email");

        Contato contatoResult = service.save(contato);

        assertNotNull(contatoResult);
    }

    @Test
    public final void testRemove() {
        Contato contato = new Contato();
        contato.setNome("contato");
        contato.setEmail("email");

        Contato contatoRemove = service.save(contato);
        service.remove(contatoRemove);

    }

    @Test
    public final void testFindById() {
        Contato contato = new Contato();
        contato.setNome("contato");
        contato.setEmail("email");

        contato = service.save(contato);

        Contato contatoFind = service.findById(contato.getId());

        assertNotNull(contatoFind);
        try {

            assertEquals(contatoFind, contato);
        } catch (AssertionError e) {
            fail("os contatos não são iguais");
        }
    }

    @Test
    public final void testFindByNome() {
        Contato contato = new Contato();
        contato.setNome("contato1");
        contato.setEmail("email");

        contato = service.save(contato);

        Contato contatoFind = service.findByNome(contato.getNome());

        assertNotNull(contatoFind);
        try {

            assertEquals(contatoFind, contato);
        } catch (AssertionError e) {
            fail("os contatos não são iguais");
        }
    }

    @Test
    public final void testFindAll() {
        List<Contato> contatos = service.list();

        assertNotNull(contatos);
    }
}
