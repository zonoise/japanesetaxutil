package 所得税.services;

/**
 * Created by zonoise on 2017/11/20.
 */
public class 所得税ServiceImpl implements 所得税Service {

    private 所得税税率Service 税率Service;
    private 所得税控除Service 控除Service;

    public 所得税ServiceImpl(所得税控除Service 控除Service, 所得税税率Service 税率Service) {
        this.控除Service = 控除Service;
        this.税率Service = 税率Service;
    }

    public double get所得税(double 課税所得) {

        double 税率 = 税率Service.get税率(課税所得);
        double 控除額 = 控除Service.get控除額(課税所得);

        return 課税所得 * 税率 / 100 - 控除額;
    }
}