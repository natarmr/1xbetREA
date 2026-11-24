package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p2p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26262a;
    public final rqm b;

    public p2p0(String str, rqm rqmVar) {
        this.f26262a = str;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2p0)) {
            return false;
        }
        p2p0 p2p0Var = (p2p0) obj;
        return this.f26262a.equals(p2p0Var.f26262a) && this.b.equals(p2p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f26262a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26262a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetStatisticsCellUiItem(key=" + this.f26262a + ", style=" + this.b + Separators.RPAREN;
    }
}
