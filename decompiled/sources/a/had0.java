package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class had0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12719a;
    public final long b;
    public final long c;

    public had0(int i, long j, long j2) {
        this.f12719a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof had0)) {
            return false;
        }
        had0 had0Var = (had0) obj;
        return this.f12719a == had0Var.f12719a && this.b == had0Var.b && this.c == had0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Integer.hashCode(this.f12719a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(vqd.q(this.f12719a, this.b, "CyberChamp(cyberType=", ", champId="), this.c, ", sportId=", Separators.RPAREN);
    }
}
