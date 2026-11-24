package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16827a;
    public final fza0 b;

    public jnu(long j, fza0 fza0Var) {
        this.f16827a = j;
        this.b = fza0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnu)) {
            return false;
        }
        jnu jnuVar = (jnu) obj;
        return this.f16827a == jnuVar.f16827a && this.b == jnuVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f16827a) * 31);
    }

    public final String toString() {
        return "GetGamesParams(partitionId=" + this.f16827a + ", category=" + this.b + Separators.RPAREN;
    }
}
