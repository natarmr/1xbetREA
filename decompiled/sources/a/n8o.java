package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n8o implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23100a;
    public final jjm b;

    public n8o(String str, jjm jjmVar) {
        this.f23100a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8o)) {
            return false;
        }
        n8o n8oVar = (n8o) obj;
        return this.f23100a.equals(n8oVar.f23100a) && this.b.equals(n8oVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f23100a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23100a.hashCode() * 31);
    }

    public final String toString() {
        return "EsportsWorldCupHeaderUiModel(key=" + this.f23100a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
