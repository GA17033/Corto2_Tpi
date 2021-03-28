/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.especialistajee.jbib.model;

import java.util.Date;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FUJITSU
 */
public class LibroDomainTest {
    
 
    @Test
    public void testEquals() {
      LibroDomain libro1 =  new LibroDomain ("13456789");
      LibroDomain libro2 = new LibroDomain ("13456789");
      assertTrue(libro1.equals(libro2));
      libro2.setIsbn(null);
      assertFalse(libro1.equals(libro2));
    
    }
    public void testContainsEjemplares(){
    LibroDomain libro1 = new LibroDomain("123456789");
    EjemplarDomain ejemplar1 = new EjemplarDomain (libro1 , "A");
    EjemplarDomain ejemplar2 = new EjemplarDomain (libro1 , "B");
    EjemplarDomain ejemplar3 = new EjemplarDomain (libro1 , "C");
    libro1.getEjemplares().add(ejemplar1);
      libro1.getEjemplares().add(ejemplar2);
      assertTrue (libro1.getEjemplares().contains(ejemplar1));
      assertTrue (libro1.getEjemplares().contains(ejemplar3));
      assertTue (libro1.getEjemplares().contains(new EjemplarDomain(libro1, "A")));
      
    
    }

   
}
