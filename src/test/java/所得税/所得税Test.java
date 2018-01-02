package 所得税;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import 所得税.services.所得税Service;
import 所得税.services.所得税ServiceImpl;
import 所得税.services.所得税控除ServiceImpl;
import 所得税.services.所得税税率ServiceImpl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by zonoise on 2017/11/20.
 */
@RunWith(JUnit4.class)
public class 所得税Test {
    所得税Service testTarget;
    @Before
    public void setUp() throws Exception {
        testTarget = new 所得税ServiceImpl(new 所得税控除ServiceImpl(),new 所得税税率ServiceImpl()) ;
    }

    @Test
    public void 所得税があっていること(){
        assertThat(testTarget.get所得税(0d),is(0d));//103万円の壁
    }
}
