package 所得税;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import 所得税.services.所得税税率Service;
import 所得税.services.所得税税率ServiceImpl;
import 所得税.services.給与所得控除Service;
import 所得税.services.給与所得控除ServiceImpl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by zonoise on 2017/11/18.
 */

@RunWith(JUnit4.class)
public class 所得税税率Test {

    private 所得税税率Service testTarget;

    @Before
    public void setUp() throws Exception {
        this.testTarget = new 所得税税率ServiceImpl();
    }

    @Test
    public void 所得税税率があっていること(){
          assertThat(this.testTarget.get税率(1),is(5d));
          assertThat(this.testTarget.get税率(4000 * 10000),is(40d));
          assertThat(this.testTarget.get税率(4000 * 10000 + 1),is(45d));
    }
}