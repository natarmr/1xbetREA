package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m4s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21188a;

    public m4s0(mdm mdmVar) {
        this.f21188a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4s0) && this.f21188a.equals(((m4s0) obj).f21188a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_RECOMMENDS_HEADER";
    }

    public final int hashCode() {
        return this.f21188a.hashCode() + 443487243;
    }

    public final String toString() {
        return b1j.j("TournamentRecommendsHeaderUiItem(key=KEY_RECOMMENDS_HEADER, config=", this.f21188a, Separators.RPAREN);
    }
}
