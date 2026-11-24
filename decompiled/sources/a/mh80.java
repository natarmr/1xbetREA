package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mh80 implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh80 f21778a;

    public mh80(lh80 lh80Var) {
        this.f21778a = lh80Var;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return w6kVar.T(this.f21778a.b(k6zVar));
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return w6kVar.T(this.f21778a.a());
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return w6kVar.T(this.f21778a.c(k6zVar));
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return w6kVar.T(this.f21778a.d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mh80) {
            return Intrinsics.d(((mh80) obj).f21778a, this.f21778a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21778a.hashCode();
    }

    public final String toString() {
        k6z k6zVar = k6z.f17794a;
        hh80 hh80Var = this.f21778a;
        float fB = hh80Var.b(k6zVar);
        float fD = hh80Var.d();
        float fC = hh80Var.c(k6zVar);
        float fA = hh80Var.a();
        String strC = ycl.c(fB);
        String strC2 = ycl.c(fD);
        return ua80.m(b1j.n("PaddingValues(", strC, ", ", strC2, ", "), ycl.c(fC), ", ", ycl.c(fA), Separators.RPAREN);
    }
}
