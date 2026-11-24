package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18452a;

    public kkp(mdm mdmVar) {
        this.f18452a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkp) && this.f18452a.equals(((kkp) obj).f18452a);
    }

    public final int hashCode() {
        return this.f18452a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f18452a, Separators.RPAREN);
    }
}
