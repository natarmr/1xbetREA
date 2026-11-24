package a;

/* JADX INFO: loaded from: classes.dex */
public final class ehn extends fhn {
    public final double m;
    public final double n;
    public final double o;
    public final double p;

    public ehn(String str) {
        this.b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.m = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.n = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.o = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.p = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    @Override // a.fhn
    public final double d(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = i(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dI = i(d4);
        double d5 = d3 + d2;
        double dI2 = i(d5);
        double dJ = j(d4);
        return (((d - dI) * (j(d5) - dJ)) / (dI2 - dI)) + dJ;
    }

    @Override // a.fhn
    public final double e(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = i(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (j(d5) - j(d4)) / (i(d5) - i(d4));
    }

    public final double i(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.o * d5) + (this.m * d4) + (d * d * d);
    }

    public final double j(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.p * d5) + (this.n * d4) + (d * d * d);
    }
}
