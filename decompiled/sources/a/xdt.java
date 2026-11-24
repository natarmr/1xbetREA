package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xdt extends aet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wqd f40712a;
    public final mzb0 b;

    public xdt(wqd wqdVar, mzb0 mzb0Var) {
        this.f40712a = wqdVar;
        this.b = mzb0Var;
    }

    @Override // a.aet
    public final mzb0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdt)) {
            return false;
        }
        xdt xdtVar = (xdt) obj;
        return this.f40712a.equals(xdtVar.f40712a) && this.b.equals(xdtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40712a.hashCode() * 31);
    }

    public final String toString() {
        return "Kind2(state=" + this.f40712a + ", product=" + this.b + Separators.RPAREN;
    }
}
