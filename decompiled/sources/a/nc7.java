package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nc7 extends qc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23277a;
    public final double b;
    public final String c;

    public nc7(double d, String str, boolean z) {
        str.getClass();
        this.f23277a = z;
        this.b = d;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc7)) {
            return false;
        }
        nc7 nc7Var = (nc7) obj;
        return this.f23277a == nc7Var.f23277a && Double.compare(this.b, nc7Var.b) == 0 && Intrinsics.d(this.c, nc7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, Boolean.hashCode(this.f23277a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeBetSumText(freeBet=");
        sb.append(this.f23277a);
        sb.append(", sum=");
        sb.append(this.b);
        return rw2.o(sb, ", currency=", this.c, Separators.RPAREN);
    }
}
