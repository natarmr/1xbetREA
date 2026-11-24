package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vb9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37130a;
    public final long b;
    public final List c;
    public final boolean d;
    public final String e;
    public final int f;

    public vb9(int i, long j, long j2, String str, List list, boolean z) {
        list.getClass();
        this.f37130a = j;
        this.b = j2;
        this.c = list;
        this.d = z;
        this.e = str;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb9)) {
            return false;
        }
        vb9 vb9Var = (vb9) obj;
        return this.f37130a == vb9Var.f37130a && this.b == vb9Var.b && Intrinsics.d(this.c, vb9Var.c) && this.d == vb9Var.d && this.e.equals(vb9Var.e) && this.f == vb9Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(brm0.e(dw9.a(rw2.b(Long.hashCode(this.f37130a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f37130a, "BuilderCouponModel(id=", ", sportId=");
        hne.x(sbQ, this.b, ", games=", this.c);
        hne.u(", block=", ", exceptionText=", this.e, sbQ, this.d);
        return vqd.p(sbQ, ", exceptionId=", this.f, Separators.RPAREN);
    }
}
