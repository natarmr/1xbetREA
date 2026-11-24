package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyv0 f27973a;
    public final boolean b;
    public final boolean c;

    public q1w0(dyv0 dyv0Var, boolean z, boolean z2) {
        this.f27973a = dyv0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1w0)) {
            return false;
        }
        q1w0 q1w0Var = (q1w0) obj;
        return this.f27973a.equals(q1w0Var.f27973a) && this.b == q1w0Var.b && this.c == q1w0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f27973a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XgamesRemoteConfigModel(xGamesModel=");
        sb.append(this.f27973a);
        sb.append(", hasSectionXGames=");
        sb.append(this.b);
        sb.append(", hasPopularGamesCarusel=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
