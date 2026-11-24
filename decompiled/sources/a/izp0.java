package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class izp0 implements lzp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f15646a;

    public izp0(mdm mdmVar) {
        this.f15646a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izp0) && this.f15646a.equals(((izp0) obj).f15646a);
    }

    public final int hashCode() {
        return this.f15646a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyLottie=", this.f15646a, Separators.RPAREN);
    }
}
