package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mzd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22650a;
    public final int b;
    public final String c;
    public final String d;

    public mzd0(int i, String str, int i2, String str2) {
        this.f22650a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzd0)) {
            return false;
        }
        mzd0 mzd0Var = (mzd0) obj;
        return this.f22650a == mzd0Var.f22650a && this.b == mzd0Var.b && this.c.equals(mzd0Var.c) && this.d.equals(mzd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, Integer.hashCode(this.f22650a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ua80.m(dw9.t("RainbowStatisticMatchesMatchBansModel(teamId=", this.f22650a, ", id=", ", name=", this.b), this.c, ", image=", this.d, Separators.RPAREN);
    }
}
