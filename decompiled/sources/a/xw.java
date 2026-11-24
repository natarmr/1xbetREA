package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xw implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vhv0 f41586a;
    public final vhv0 b;

    public xw(vhv0 vhv0Var, vhv0 vhv0Var2) {
        this.f41586a = vhv0Var;
        this.b = vhv0Var2;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return this.b.a(w6kVar, k6zVar) + this.f41586a.a(w6kVar, k6zVar);
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return this.b.b(w6kVar) + this.f41586a.b(w6kVar);
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return this.b.c(w6kVar, k6zVar) + this.f41586a.c(w6kVar, k6zVar);
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return this.b.d(w6kVar) + this.f41586a.d(w6kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return Intrinsics.d(xwVar.f41586a, this.f41586a) && xwVar.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f41586a.hashCode();
    }

    public final String toString() {
        return Separators.LPAREN + this.f41586a + " + " + this.b + Separators.RPAREN;
    }
}
