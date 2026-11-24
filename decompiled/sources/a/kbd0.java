package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18009a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public kbd0(int i, int i2, int i3, boolean z, boolean z2) {
        this.f18009a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbd0)) {
            return false;
        }
        kbd0 kbd0Var = (kbd0) obj;
        return this.f18009a == kbd0Var.f18009a && this.b == kbd0Var.b && this.c == kbd0Var.c && this.d == kbd0Var.d && this.e == kbd0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, brm0.e(Boolean.hashCode(this.f18009a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NewsMain(fromAggregator=", ", showNavBar=", ", position=", this.f18009a, this.b);
        axq.r(this.c, this.d, ", bannerId=", ", bannerType=", sbQ);
        return rz4.j(this.e, Separators.RPAREN, sbQ);
    }
}
