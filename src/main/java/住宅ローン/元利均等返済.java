package 住宅ローン;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by zonoise on 2017/11/27.
 */
public class 元利均等返済 {
    private double 借入金;
    private double 年金利;
    private double 月返済額;

    public double get借入金() {
        return 借入金;
    }

    public 元利均等返済(double 借入金, double 年金利,double 月返済額) {
        this.借入金 = 借入金;
        this.年金利 = 年金利;
        this.月返済額 = 月返済額;
    }

    public void set借入金(double 借入金) {
        this.借入金 = 借入金;
    }

    public static class month{
        private double 返済前借入金残高;
        private double 返済利息;
        private double 返済元金;

        public month(double 借入金残高, double 返済元金, double 返済利息) {
            this.返済前借入金残高 = 借入金残高;
            this.返済元金 = 返済元金;
            this.返済利息 = 返済利息;
        }

        public double get返済前借入金残高() {
            return 返済前借入金残高;
        }
        public double get返済後借入金残高() {
            return 返済前借入金残高-返済元金;
        }

        public double get返済元金() {
            return 返済元金;
        }

        public double get返済利息() {
            return 返済利息;
        }
    }

    public month run(){
            double 月返済利息 = Math.floor(借入金 * 年金利 / 12);

            double 月返済元金 = 月返済額 - 月返済利息;
            month m = new month(借入金,月返済元金,月返済利息);
            this.借入金 = this.借入金 - 月返済元金;
            return m;
    }
}
