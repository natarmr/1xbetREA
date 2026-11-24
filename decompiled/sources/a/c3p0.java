package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c3p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3689a;
    public final t2p0 b;

    public c3p0(boolean z, t2p0 t2p0Var) {
        this.f3689a = z;
        this.b = t2p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3p0)) {
            return false;
        }
        c3p0 c3p0Var = (c3p0) obj;
        return this.f3689a == c3p0Var.f3689a && this.b.equals(c3p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f3689a) * 31);
    }

    public final String toString() {
        return "TeamBetStatisticsUiState(isRefreshing=" + this.f3689a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
