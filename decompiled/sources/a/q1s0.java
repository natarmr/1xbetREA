package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q1s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f27970a;

    public q1s0(hjm hjmVar) {
        this.f27970a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1s0) && this.f27970a.equals(((q1s0) obj).f27970a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_RECOMMENDS";
    }

    public final int hashCode() {
        return this.f27970a.hashCode() - 795767383;
    }

    public final String toString() {
        return "TournamentHeaderUiItem(key=KEY_RECOMMENDS, model=" + this.f27970a + Separators.RPAREN;
    }
}
