package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wc implements ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f38902a;
    public final ijl b;

    public wc(ijl ijlVar, jjl jjlVar) {
        this.f38902a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return this.f38902a.equals(wcVar.f38902a) && this.b == wcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38902a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(uiModel=" + this.f38902a + ", style=" + this.b + Separators.RPAREN;
    }
}
