package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kvd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18952a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;

    public kvd0(String str, int i, int i2, int i3, int i4, float f, int i5) {
        this.f18952a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvd0)) {
            return false;
        }
        kvd0 kvd0Var = (kvd0) obj;
        return this.f18952a.equals(kvd0Var.f18952a) && this.b == kvd0Var.b && this.c == kvd0Var.c && this.d == kvd0Var.d && this.e == kvd0Var.e && Float.compare(this.f, kvd0Var.f) == 0 && this.g == kvd0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + defpackage.c.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f18952a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "RainbowGameStatisticMainStatPlayerModel(name=", this.f18952a, ", kills=", ", deaths=");
        axq.r(this.c, this.d, ", kost=", ", eps=", sbP);
        sbP.append(this.e);
        sbP.append(", kpr=");
        sbP.append(this.f);
        sbP.append(", hs=");
        return rz4.j(this.g, Separators.RPAREN, sbP);
    }
}
