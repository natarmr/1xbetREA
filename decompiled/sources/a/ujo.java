package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ujo implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vhv0 f35793a;
    public final vhv0 b;

    public ujo(vhv0 vhv0Var, vhv0 vhv0Var2) {
        this.f35793a = vhv0Var;
        this.b = vhv0Var2;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        int iA = this.f35793a.a(w6kVar, k6zVar) - this.b.a(w6kVar, k6zVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        int iB = this.f35793a.b(w6kVar) - this.b.b(w6kVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        int iC = this.f35793a.c(w6kVar, k6zVar) - this.b.c(w6kVar, k6zVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        int iD = this.f35793a.d(w6kVar) - this.b.d(w6kVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujo)) {
            return false;
        }
        ujo ujoVar = (ujo) obj;
        return Intrinsics.d(ujoVar.f35793a, this.f35793a) && Intrinsics.d(ujoVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35793a.hashCode() * 31);
    }

    public final String toString() {
        return Separators.LPAREN + this.f35793a + " - " + this.b + Separators.RPAREN;
    }
}
