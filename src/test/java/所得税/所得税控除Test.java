package 所得税;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import 所得税.services.所得税控除Service;
import 所得税.services.所得税控除ServiceImpl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by zonoise on 2017/11/19.
 */
@RunWith(JUnit4.class)
public class 所得税控除Test {
    private 所得税控除Service testTarget;

    @Before
    public void setUp() throws Exception {
        this.testTarget = new 所得税控除ServiceImpl() ;
    }

    @Test
  public void 所得税控除があっていること(){
        assertThat( testTarget.get控除額( 4000 * 10000),is(2796000d));
        assertThat( testTarget.get控除額( 4000 * 10000 + 1),is(4796000d));
  }
}