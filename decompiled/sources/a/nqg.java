package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nqg implements qqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4v0 f23958a;

    public nqg(s4v0 s4v0Var) {
        this.f23958a = s4v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqg) && this.f23958a.equals(((nqg) obj).f23958a);
    }

    public final int hashCode() {
        return this.f23958a.hashCode();
    }

    public final String toString() {
        return "OpenFullStatistic(webStatSettings=" + this.f23958a + Separators.RPAREN;
    }
}
