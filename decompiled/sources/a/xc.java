package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xc implements bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f40622a;
    public final ijl b;

    public xc(ijl ijlVar, jjl jjlVar) {
        this.f40622a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return this.f40622a.equals(xcVar.f40622a) && this.b == xcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40622a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(uiModel=" + this.f40622a + ", style=" + this.b + Separators.RPAREN;
    }
}
