package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e1l0 implements f1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f7042a;
    public final oe b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final a4x g;

    public e1l0(pzu pzuVar, oe oeVar, String str, boolean z, boolean z2, boolean z3, a4x a4xVar) {
        a4xVar.getClass();
        this.f7042a = pzuVar;
        this.b = oeVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = a4xVar;
    }

    @Override // a.f1l0
    public final oe a() {
        return this.b;
    }

    @Override // a.f1l0
    public final boolean b() {
        return this.f;
    }

    @Override // a.f1l0
    public final boolean c() {
        return this.e;
    }

    @Override // a.f1l0
    public final String d() {
        return this.c;
    }

    @Override // a.i1l0
    public final pzu e() {
        return this.f7042a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1l0) {
            e1l0 e1l0Var = (e1l0) obj;
            if (this.f7042a == e1l0Var.f7042a && this.b.equals(e1l0Var.b) && this.c.equals(e1l0Var.c) && this.d == e1l0Var.d && this.e == e1l0Var.e && this.f == e1l0Var.f && Intrinsics.d(this.g, e1l0Var.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.f1l0
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(brm0.e(brm0.e(ua80.b((this.b.hashCode() + (this.f7042a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("History(strings=");
        sb.append(this.f7042a);
        sb.append(", accountInfoState=");
        sb.append(this.b);
        sb.append(", transferSumInput=");
        brm0.C(this.c, ", isTransferButtonEnabled=", ", isTransferLoading=", sb, this.d);
        ua80.u(", isSwipeRefreshing=", ", historyList=", sb, this.e, this.f);
        return cs0.n(sb, this.g, Separators.RPAREN);
    }
}
