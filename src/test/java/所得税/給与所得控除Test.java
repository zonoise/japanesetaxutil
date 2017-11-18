package 所得税;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import 所得税.services.給与所得控除Service;
import 所得税.services.給与所得控除ServiceImpl;

/**
 * Created by zonoise on 2017/11/18.
 */

@RunWith(JUnit4.class)
public class 給与所得控除Test {

    private 給与所得控除Service testTarget;

    @Before
    public void setUp() throws Exception {
        this.testTarget = new 給与所得控除ServiceImpl();
    }

    @Test
    public void 給与所得控除額があっていること(){
        assertThat(testTarget.get給与所得控除(1),is(650000D));
        assertThat(testTarget.get給与所得控除(650000*10/4),is(650000D));
        assertThat(testTarget.get給与所得控除(1800001),is(1800001 * 0.3 + 180000));
    }
}