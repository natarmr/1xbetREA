package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uiw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final grh f35753a;
    public final boolean b;

    public uiw(grh grhVar, boolean z) {
        this.f35753a = grhVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiw)) {
            return false;
        }
        uiw uiwVar = (uiw) obj;
        return this.f35753a.equals(uiwVar.f35753a) && this.b == uiwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35753a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeMainGameUiModel(cardUiModel=" + this.f35753a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
