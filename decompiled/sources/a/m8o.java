package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m8o implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21381a;
    public final vb90 b;

    public m8o(String str, vb90 vb90Var) {
        this.f21381a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8o)) {
            return false;
        }
        m8o m8oVar = (m8o) obj;
        return this.f21381a.equals(m8oVar.f21381a) && this.b.equals(m8oVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21381a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21381a.hashCode() * 31);
    }

    public final String toString() {
        return "EsportsWorldCupGameCardUiModel(key=" + this.f21381a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
