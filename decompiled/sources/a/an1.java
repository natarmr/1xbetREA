package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class an1 implements fn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1128a;
    public final long b;
    public final boolean c;

    public an1(long j, boolean z, long j2) {
        this.f1128a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an1)) {
            return false;
        }
        an1 an1Var = (an1) obj;
        return this.f1128a == an1Var.f1128a && this.b == an1Var.b && this.c == an1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f1128a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f1128a, "OnFavoriteClick(gameId=", ", categoryId=");
        hne.t(this.b, ", isFavorite=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
