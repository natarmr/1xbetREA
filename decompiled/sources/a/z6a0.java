package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z6a0 implements c7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f43857a;

    public z6a0(mdm mdmVar) {
        this.f43857a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6a0) && this.f43857a.equals(((z6a0) obj).f43857a);
    }

    public final int hashCode() {
        return this.f43857a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyData(config=", this.f43857a, Separators.RPAREN);
    }
}
