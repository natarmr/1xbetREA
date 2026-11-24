package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zll0 implements cml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44586a;
    public final n0x b;
    public final hol0 c;
    public final hnl0 d;

    public zll0(long j, n0x n0xVar, hol0 hol0Var, hnl0 hnl0Var) {
        this.f44586a = j;
        this.b = n0xVar;
        this.c = hol0Var;
        this.d = hnl0Var;
    }

    @Override // a.cml0
    public final long a() {
        return this.f44586a;
    }

    @Override // a.cml0
    public final ynl0 b() {
        return this.d;
    }

    @Override // a.cml0
    public final kol0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zll0)) {
            return false;
        }
        zll0 zll0Var = (zll0) obj;
        return this.f44586a == zll0Var.f44586a && this.b.equals(zll0Var.b) && this.c.equals(zll0Var.c) && this.d.equals(zll0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f140.f(this.b, Long.hashCode(this.f44586a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f44586a + ", watermark=" + this.b + ", topBlock=" + this.c + ", middleBlock=" + this.d + Separators.RPAREN;
    }
}
