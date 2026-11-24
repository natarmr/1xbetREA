package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ezm implements gzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8677a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final fgm e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ezm(int i, long j, long j2, boolean z) {
        long j3 = (i & 4) != 0 ? 0L : j2;
        z = (i & 8) != 0 ? false : z;
        fgm fgmVar = fgm.f9498a;
        this(j, z, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezm)) {
            return false;
        }
        ezm ezmVar = (ezm) obj;
        return this.f8677a == ezmVar.f8677a && this.b == ezmVar.b && this.c == ezmVar.c && this.d == ezmVar.d && this.e == ezmVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(rw2.b(brm0.e(Long.hashCode(this.f8677a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f8677a, "Timer(timeMs=", ", run=", this.b);
        kng0.A(sbR, ", requestedMsAt=", this.c, ", hasPrematchTimer=");
        sbR.append(this.d);
        sbR.append(", timerDirection=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    public ezm(long j, boolean z, long j2) {
        fgm fgmVar = fgm.b;
        this.f8677a = j;
        this.b = true;
        this.c = j2;
        this.d = z;
        this.e = fgmVar;
    }
}
