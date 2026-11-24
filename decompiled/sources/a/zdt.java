package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zdt extends aet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqd f44224a;
    public final mzb0 b;

    public zdt(xqd xqdVar, mzb0 mzb0Var) {
        this.f44224a = xqdVar;
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
        if (!(obj instanceof zdt)) {
            return false;
        }
        zdt zdtVar = (zdt) obj;
        return this.f44224a.equals(zdtVar.f44224a) && this.b.equals(zdtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44224a.hashCode() * 31);
    }

    public final String toString() {
        return "Kind4(state=" + this.f44224a + ", product=" + this.b + Separators.RPAREN;
    }
}
