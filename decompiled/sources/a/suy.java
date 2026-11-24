package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class suy {
    public static final ruy Companion = new ruy();
    public static final a8z[] f = {maz.a(wez.f39042a, new pcy(11)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wuy f32841a;
    public final boolean b;
    public final long c;
    public final long d;
    public final boolean e;

    public /* synthetic */ suy(int i, wuy wuyVar, boolean z, long j, long j2, boolean z2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, quy.f29363a.getDescriptor());
            throw null;
        }
        this.f32841a = wuyVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = z2;
    }

    public static suy a(suy suyVar, wuy wuyVar, long j, long j2, boolean z, int i) {
        if ((i & 1) != 0) {
            wuyVar = suyVar.f32841a;
        }
        wuy wuyVar2 = wuyVar;
        boolean z2 = (i & 2) != 0 ? suyVar.b : true;
        if ((i & 4) != 0) {
            j = suyVar.c;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = suyVar.d;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = suyVar.e;
        }
        suyVar.getClass();
        wuyVar2.getClass();
        return new suy(wuyVar2, z2, j3, j4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suy)) {
            return false;
        }
        suy suyVar = (suy) obj;
        return this.f32841a == suyVar.f32841a && this.b == suyVar.b && this.c == suyVar.c && this.d == suyVar.d && this.e == suyVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(rw2.b(brm0.e(this.f32841a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageSelectorBlockModel(clickStatus=");
        sb.append(this.f32841a);
        sb.append(", isSubsequentBlock=");
        sb.append(this.b);
        sb.append(", endBlockingTime=");
        sb.append(this.c);
        kng0.A(sb, ", lastRoundedBlockTime=", this.d, ", isUnfinishedBlockTimeLeft=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }

    public suy(wuy wuyVar, boolean z, long j, long j2, boolean z2) {
        this.f32841a = wuyVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = z2;
    }
}
