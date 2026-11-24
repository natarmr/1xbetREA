package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u2p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34958a;
    public final jjm b;

    public u2p0(String str, jjm jjmVar) {
        this.f34958a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2p0)) {
            return false;
        }
        u2p0 u2p0Var = (u2p0) obj;
        return this.f34958a.equals(u2p0Var.f34958a) && this.b.equals(u2p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f34958a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34958a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetStatisticsHeaderUiItem(key=" + this.f34958a + ", model=" + this.b + Separators.RPAREN;
    }
}
