package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f41663a;
    public final yxk0 b;
    public final String c;
    public final esr d;
    public final boolean e;

    public xxk0(double d, yxk0 yxk0Var, String str, esr esrVar, boolean z) {
        yxk0Var.getClass();
        str.getClass();
        esrVar.getClass();
        this.f41663a = d;
        this.b = yxk0Var;
        this.c = str;
        this.d = esrVar;
        this.e = z;
    }

    public static xxk0 a(xxk0 xxk0Var, boolean z) {
        double d = xxk0Var.f41663a;
        yxk0 yxk0Var = xxk0Var.b;
        String str = xxk0Var.c;
        esr esrVar = xxk0Var.d;
        xxk0Var.getClass();
        yxk0Var.getClass();
        str.getClass();
        esrVar.getClass();
        return new xxk0(d, yxk0Var, str, esrVar, z);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ua80.b((this.b.hashCode() + brm0.d(this.f41663a, 31, 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinAndWinBet(betSum=");
        sb.append(this.f41663a);
        sb.append(", typeBet=");
        sb.append(this.b);
        sb.append(", currencySymbol=");
        sb.append(this.c);
        sb.append(", bonus=");
        sb.append(this.d);
        return f140.n(sb, ", highlighted=", this.e, Separators.RPAREN);
    }
}
