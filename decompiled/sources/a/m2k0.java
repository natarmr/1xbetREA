package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m2k0 implements p2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f21065a;
    public final a4x b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public m2k0(a4x a4xVar, a4x a4xVar2, boolean z, boolean z2, boolean z3) {
        a4xVar2.getClass();
        this.f21065a = a4xVar;
        this.b = a4xVar2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // a.p2k0
    public final boolean a() {
        return this.d;
    }

    @Override // a.p2k0
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2k0)) {
            return false;
        }
        m2k0 m2k0Var = (m2k0) obj;
        return this.f21065a.equals(m2k0Var.f21065a) && Intrinsics.d(this.b, m2k0Var.b) && this.c == m2k0Var.c && this.d == m2k0Var.d && this.e == m2k0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(cs0.b(this.b, this.f21065a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("Content(menuItemsUiModelsList=", this.f21065a, ", singlePageTransactionHistoryUiItemsList=", this.b, ", canLoadNextPage=");
        ua80.u(", isRefreshing=", ", refreshEnabled=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
