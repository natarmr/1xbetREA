package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y3r0 implements a4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41967a;
    public final String b;
    public final gy30 c;

    public y3r0(int i, String str, gy30 gy30Var) {
        str.getClass();
        this.f41967a = i;
        this.b = str;
        this.c = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3r0)) {
            return false;
        }
        y3r0 y3r0Var = (y3r0) obj;
        return this.f41967a == y3r0Var.f41967a && Intrinsics.d(this.b, y3r0Var.b) && this.c.equals(y3r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f41967a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f41967a, "Content(id=", ", title=", this.b, ", style=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
