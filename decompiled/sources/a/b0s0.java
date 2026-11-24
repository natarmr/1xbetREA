package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b0s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1775a;
    public final int b;
    public final int c;
    public final int d;

    public b0s0(int i, int i2, int i3, String str) {
        str.getClass();
        this.f1775a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0s0)) {
            return false;
        }
        b0s0 b0s0Var = (b0s0) obj;
        return Intrinsics.d(this.f1775a, b0s0Var.f1775a) && this.b == b0s0Var.b && this.c == b0s0Var.c && this.d == b0s0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, this.f1775a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", count=", Separators.RPAREN, kng0.p(this.b, "TournamentCsFeedStatisticMapModel(name=", this.f1775a, ", ctWinrate=", ", tWinrate="));
    }
}
