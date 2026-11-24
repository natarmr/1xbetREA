package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pka0 extends w8b {
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public pka0(int i, int i2, int i3, String str) {
        super(vqd.e(str, str), Integer.valueOf(i3), Integer.valueOf(i2), 6);
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pka0)) {
            return false;
        }
        pka0 pka0Var = (pka0) obj;
        return Intrinsics.d(this.d, pka0Var.d) && this.e == pka0Var.e && this.f == pka0Var.f && this.g == pka0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, this.d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", maxWidthCell=", Separators.RPAREN, kng0.p(this.e, "PlayersStatisticsCricketRowHeader(title=", this.d, ", spaceWidth=", ", minWidthCell="));
    }
}
