/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exerciciogomas.util.Maquina;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testEstado() {
        Maquina maquina = new Maquina(1);
        maquina.insereMoeda(1);
        maquina.acionaAlavanca();
        Assert.assertEquals(maquina.getGomas(), 0);        
    }
    @Test
    public void testEstadoFail() {
        Maquina maquina = new Maquina(0);
        maquina.insereMoeda(1);
        maquina.acionaAlavanca();
        Assert.assertEquals(maquina.getGomas(), 0);        
    }
}
