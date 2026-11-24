package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a450 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f207a;
    public final x4t b;

    public a450(long j, x4t x4tVar) {
        this.f207a = j;
        this.b = x4tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a450)) {
            return false;
        }
        a450 a450Var = (a450) obj;
        return this.f207a == a450Var.f207a && this.b.equals(a450Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f207a) * 31);
    }

    public final String toString() {
        return "OnGameClick(gameId=" + this.f207a + ", categoryType=" + this.b + Separators.RPAREN;
    }
}
