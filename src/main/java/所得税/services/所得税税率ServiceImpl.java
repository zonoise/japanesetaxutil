package 所得税.services;

/**
 * Created by zonoise on 2017/11/19.
 */
public class 所得税税率ServiceImpl implements 所得税税率Service{
    public double get税率(double 所得) {
        double x = 所得;
        double 税率 = 0;

        if (x <= 195 * 10000) {
            税率 = 5;
        } else if (x <= 330 * 10000) {
            税率 = 10;
        } else if (x <= 695 * 10000) {
            税率 = 20;
        } else if (x <= 900 * 10000) {
            税率 = 23;
        } else if (x <= 1800 * 10000) {
            税率 = 33;
        } else if (x <= 4000 * 10000) {
            税率 = 40;
        } else {
            税率 = 45;
        }
        return 税率;
    }
}