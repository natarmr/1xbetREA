package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oka0 extends v8b {
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public oka0(int i, int i2, int i3, String str) {
        super(6, Integer.valueOf(i2), Integer.valueOf(i), q3d.j(vqd.e(str, str), new g9b(i3)));
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oka0)) {
            return false;
        }
        oka0 oka0Var = (oka0) obj;
        return Intrinsics.d(this.d, oka0Var.d) && this.e == oka0Var.e && this.f == oka0Var.f && this.g == oka0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, this.d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", spaceWidth=", Separators.RPAREN, kng0.p(this.e, "PlayersStatisticsCricketColumnHeader(title=", this.d, ", minWidthCell=", ", maxWidthCell="));
    }
}
