package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class doy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6434a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;

    public doy(int i, int i2, int i3, int i4, int i5, String str) {
        this.f6434a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doy)) {
            return false;
        }
        doy doyVar = (doy) obj;
        return this.f6434a == doyVar.f6434a && this.b == doyVar.b && this.c == doyVar.c && this.d == doyVar.d && this.e == doyVar.e && this.f.equals(doyVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f6434a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("KillerJokerCoordinateUiModel(image=", this.f6434a, ", left=", ", top=", this.b);
        axq.r(this.c, this.d, ", right=", ", bottom=", sbT);
        return rw2.k(this.e, ", tag=", this.f, Separators.RPAREN, sbT);
    }
}
