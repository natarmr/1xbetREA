package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z48 implements c58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f43756a;

    public z48(mdm mdmVar) {
        this.f43756a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z48) && this.f43756a.equals(((z48) obj).f43756a);
    }

    public final int hashCode() {
        return this.f43756a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyLottie=", this.f43756a, Separators.RPAREN);
    }
}
