package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j2f implements k2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15777a;

    public j2f(String str) {
        this.f15777a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2f) && this.f15777a.equals(((j2f) obj).f15777a);
    }

    public final int hashCode() {
        return this.f15777a.hashCode();
    }

    public final String toString() {
        return kng0.l("TotoBet(segmentTitle=", this.f15777a, Separators.RPAREN);
    }
}
