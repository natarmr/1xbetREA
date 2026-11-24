package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p2j implements s2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26252a;
    public final int b;
    public final long c;

    public p2j(String str, int i, long j) {
        this.f26252a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2j)) {
            return false;
        }
        p2j p2jVar = (p2j) obj;
        return this.f26252a.equals(p2jVar.f26252a) && this.b == p2jVar.b && this.c == p2jVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, this.f26252a.hashCode() * 31, 31);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, kng0.p(this.b, "OnGamesClick(screen=", this.f26252a, ", progress=", ", productId="));
    }
}
