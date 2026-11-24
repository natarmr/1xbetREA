package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z80 extends c90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43944a;
    public final double b;
    public final String c;

    public z80(double d, String str, boolean z) {
        str.getClass();
        this.f43944a = z;
        this.b = d;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80)) {
            return false;
        }
        z80 z80Var = (z80) obj;
        return this.f43944a == z80Var.f43944a && Double.compare(this.b, z80Var.b) == 0 && Intrinsics.d(this.c, z80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, Boolean.hashCode(this.f43944a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeBetSumText(freeBet=");
        sb.append(this.f43944a);
        sb.append(", sum=");
        sb.append(this.b);
        return rw2.o(sb, ", currency=", this.c, Separators.RPAREN);
    }
}
