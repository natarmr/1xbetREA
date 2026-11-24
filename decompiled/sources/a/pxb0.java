package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pxb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27747a;
    public final int b;
    public final int c;
    public final String d;
    public final byb0 e;
    public final double f;
    public final int g;
    public final String h;
    public final int i;

    public pxb0(String str, int i, int i2, String str2, byb0 byb0Var, double d, int i3, String str3, int i4) {
        str.getClass();
        this.f27747a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = byb0Var;
        this.f = d;
        this.g = i3;
        this.h = str3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxb0)) {
            return false;
        }
        pxb0 pxb0Var = (pxb0) obj;
        return Intrinsics.d(this.f27747a, pxb0Var.f27747a) && this.b == pxb0Var.b && this.c == pxb0Var.c && this.d.equals(pxb0Var.d) && this.e == pxb0Var.e && Double.compare(this.f, pxb0Var.f) == 0 && this.g == pxb0Var.g && this.h.equals(pxb0Var.h) && this.i == pxb0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ua80.b(twn.a(this.g, brm0.d(this.f, (this.e.hashCode() + ua80.b(twn.a(this.c, twn.a(this.b, this.f27747a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "PrizeItemModel(id=", this.f27747a, ", placeFrom=", ", placeTo=");
        kng0.w(this.c, ", prize=", this.d, ", type=", sbP);
        sbP.append(this.e);
        sbP.append(", amount=");
        sbP.append(this.f);
        w6x.w(this.g, ", currencyId=", ", prizesCount=", this.h, sbP);
        return vqd.p(sbP, ", freeSpinCountSpins=", this.i, Separators.RPAREN);
    }
}
