package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rip0 implements tip0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyp f30555a;

    public rip0(uyp uypVar) {
        e5h0 e5h0Var = e5h0.f7234a;
        this.f30555a = uypVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rip0) || this.f30555a != ((rip0) obj).f30555a) {
            return false;
        }
        e5h0 e5h0Var = e5h0.f7234a;
        return true;
    }

    public final int hashCode() {
        return e5h0.f7234a.hashCode() + (this.f30555a.hashCode() * 31);
    }

    public final String toString() {
        return "IconScore(iconScore=" + this.f30555a + ", scoreState=" + e5h0.f7234a + Separators.RPAREN;
    }
}
