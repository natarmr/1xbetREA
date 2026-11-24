package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uh2 implements vh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35654a;
    public final boolean b;

    public uh2(boolean z, long j) {
        this.f35654a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh2)) {
            return false;
        }
        uh2 uh2Var = (uh2) obj;
        return this.f35654a == uh2Var.f35654a && this.b == uh2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f35654a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f35654a, "OnTeamClick(id=", ", favorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
