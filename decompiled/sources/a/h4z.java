package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12456a;
    public final long b;
    public final boolean c;
    public final long d;
    public final Long e;

    public h4z(long j, long j2, boolean z, long j3, Long l) {
        this.f12456a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = l;
    }

    public static h4z a(h4z h4zVar, long j) {
        long j2 = h4zVar.b;
        boolean z = h4zVar.c;
        long j3 = h4zVar.d;
        Long l = h4zVar.e;
        h4zVar.getClass();
        return new h4z(j, j2, z, j3, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4z)) {
            return false;
        }
        h4z h4zVar = (h4z) obj;
        return this.f12456a == h4zVar.f12456a && this.b == h4zVar.b && this.c == h4zVar.c && this.d == h4zVar.d && Intrinsics.d(this.e, h4zVar.e);
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.e(rw2.b(Long.hashCode(this.f12456a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return iB + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f12456a, "CommonInfoModel(gameId=", ", userId=");
        hne.t(this.b, ", cutCoef=", sbQ, this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", marketType=");
        return ohs0.r(sbQ, this.e, Separators.RPAREN);
    }
}
