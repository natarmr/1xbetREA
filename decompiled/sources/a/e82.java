package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e82 implements i82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7353a;
    public final boolean b;

    public e82(boolean z, long j) {
        this.f7353a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e82)) {
            return false;
        }
        e82 e82Var = (e82) obj;
        return this.f7353a == e82Var.f7353a && this.b == e82Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f7353a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f7353a, "OnFavoriteClicked(teamId=", ", favourite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
