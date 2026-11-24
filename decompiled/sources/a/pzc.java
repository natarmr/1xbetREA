package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pzc implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvn f27837a;
    public final rqm b;

    public pzc(jvn jvnVar, rqm rqmVar) {
        this.f27837a = jvnVar;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc)) {
            return false;
        }
        pzc pzcVar = (pzc) obj;
        return this.f27837a == pzcVar.f27837a && this.b.equals(pzcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27837a.hashCode() * 31);
    }

    public final String toString() {
        return "CoefTypeUiItem(coefType=" + this.f27837a + ", style=" + this.b + Separators.RPAREN;
    }
}
