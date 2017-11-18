package 所得税.services;

/**
 * Created by zonoise on 2017/11/18.
 */
public class 給与所得控除ServiceImpl implements 給与所得控除Service{
    public double get給与所得控除(double 給与所得) {
        double x = 給与所得;
        if (x <= 180 * 10000) {
            if (x * 0.4 < 65 * 10000) {
                return 65 * 10000;
            } else {
                return x * 0.4;
            }
        } else if (x <= 360 * 10000) {
            return x * 0.3 + 18 * 10000;
        } else if (x <= 660 * 10000) {
            return x * 0.2 + 54 * 10000;
        } else if (x <= 1000 * 10000) {
            return x * 0.1 + 120 * 10000;
        } else {
            return 220 * 10000;
        }
    }
}