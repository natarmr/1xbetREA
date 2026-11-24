package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y7t0 implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vhv0 f42170a;
    public final vhv0 b;

    public y7t0(vhv0 vhv0Var, vhv0 vhv0Var2) {
        this.f42170a = vhv0Var;
        this.b = vhv0Var2;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return Math.max(this.f42170a.a(w6kVar, k6zVar), this.b.a(w6kVar, k6zVar));
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return Math.max(this.f42170a.b(w6kVar), this.b.b(w6kVar));
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return Math.max(this.f42170a.c(w6kVar, k6zVar), this.b.c(w6kVar, k6zVar));
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return Math.max(this.f42170a.d(w6kVar), this.b.d(w6kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7t0)) {
            return false;
        }
        y7t0 y7t0Var = (y7t0) obj;
        return Intrinsics.d(y7t0Var.f42170a, this.f42170a) && Intrinsics.d(y7t0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f42170a.hashCode();
    }

    public final String toString() {
        return Separators.LPAREN + this.f42170a + " ∪ " + this.b + Separators.RPAREN;
    }
}
