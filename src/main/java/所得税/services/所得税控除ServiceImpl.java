package 所得税.services;

/**
 * Created by zonoise on 2017/11/19.
 */
public class 所得税控除ServiceImpl implements 所得税控除Service {
    public double get控除額(double 所得){
        double x = 所得;
        double 控除額 = 0;

        if (x <= 195 * 10000) {
            控除額 = 0;
        } else if (x <= 330 * 10000) {
            控除額 = 97500;
        } else if (x <= 695 * 10000) {
            控除額 = 427500;
        } else if (x <= 900 * 10000) {
            控除額 = 636000;
        } else if (x <= 1800 * 10000) {
            控除額 = 1536000;
        } else if (x <= 4000 * 10000) {
            控除額 = 2796000;
        } else {
            控除額 = 4796000;
        }
        return 控除額;
    }
}
