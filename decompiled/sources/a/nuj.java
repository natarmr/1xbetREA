package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nuj implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24150a;
    public final jjm b;

    public nuj(String str, jjm jjmVar) {
        this.f24150a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuj)) {
            return false;
        }
        nuj nujVar = (nuj) obj;
        return this.f24150a.equals(nujVar.f24150a) && this.b.equals(nujVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f24150a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24150a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultHeaderUiModel(key=" + this.f24150a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
