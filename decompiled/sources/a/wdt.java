package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wdt extends aet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wqd f38989a;
    public final mzb0 b;

    public wdt(wqd wqdVar, mzb0 mzb0Var) {
        this.f38989a = wqdVar;
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
        if (!(obj instanceof wdt)) {
            return false;
        }
        wdt wdtVar = (wdt) obj;
        return this.f38989a.equals(wdtVar.f38989a) && this.b.equals(wdtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38989a.hashCode() * 31);
    }

    public final String toString() {
        return "Kind1(state=" + this.f38989a + ", product=" + this.b + Separators.RPAREN;
    }
}
