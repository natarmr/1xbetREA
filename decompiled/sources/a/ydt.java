package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ydt extends aet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqd f42456a;
    public final mzb0 b;

    public ydt(xqd xqdVar, mzb0 mzb0Var) {
        this.f42456a = xqdVar;
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
        if (!(obj instanceof ydt)) {
            return false;
        }
        ydt ydtVar = (ydt) obj;
        return this.f42456a.equals(ydtVar.f42456a) && this.b.equals(ydtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42456a.hashCode() * 31);
    }

    public final String toString() {
        return "Kind3(state=" + this.f42456a + ", product=" + this.b + Separators.RPAREN;
    }
}
