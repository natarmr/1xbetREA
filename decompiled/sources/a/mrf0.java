package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mrf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f22270a;
    public final String b;
    public final int c;
    public final qrf0 d;

    public /* synthetic */ mrf0(int i) {
        this(0.0d, "", 0, (i & 8) != 0 ? qrf0.g : qrf0.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrf0)) {
            return false;
        }
        mrf0 mrf0Var = (mrf0) obj;
        return Double.compare(this.f22270a, mrf0Var.f22270a) == 0 && Intrinsics.d(this.b, mrf0Var.b) && this.c == mrf0Var.c && this.d == mrf0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Double.hashCode(this.f22270a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("ResidentSafeModel(money=", this.f22270a, ", currency=", this.b);
        sbS.append(", position=");
        sbS.append(this.c);
        sbS.append(", state=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }

    public mrf0(double d, String str, int i, qrf0 qrf0Var) {
        str.getClass();
        qrf0Var.getClass();
        this.f22270a = d;
        this.b = str;
        this.c = i;
        this.d = qrf0Var;
    }
}
