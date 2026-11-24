package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class chf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4356a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public chf(int i, int i2, int i3, int i4, int i5) {
        this.f4356a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chf)) {
            return false;
        }
        chf chfVar = (chf) obj;
        return this.f4356a == chfVar.f4356a && this.b == chfVar.b && this.c == chfVar.c && this.d == chfVar.d && this.e == chfVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f4356a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CrystalRoundInfoModel(round=", this.f4356a, ", step=", ", color=", this.b);
        axq.r(this.c, this.d, ", count=", ", summ=", sbT);
        return rz4.j(this.e, Separators.RPAREN, sbT);
    }
}
