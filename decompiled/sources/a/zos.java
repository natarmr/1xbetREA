package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zos implements gps {
    public static final yos Companion = new yos();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new o9s(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44730a;
    public final sip b;
    public final long c;

    public /* synthetic */ zos(int i, bds bdsVar, sip sipVar, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, xos.f41235a.getDescriptor());
            throw null;
        }
        this.f44730a = bdsVar.f2414a;
        this.b = sipVar;
        this.c = j;
    }

    @Override // a.gps
    public final sip E() {
        return this.b;
    }

    @Override // a.gps
    public final long Y() {
        return this.f44730a;
    }

    @Override // a.gps
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zos)) {
            return false;
        }
        zos zosVar = (zos) obj;
        return bds.a(this.f44730a, zosVar.f44730a) && this.b == zosVar.b && this.c == zosVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f44730a) * 31)) * 31);
    }

    public final String toString() {
        String strB = bds.b(this.f44730a);
        StringBuilder sb = new StringBuilder("FetchGameDetails(gameId=");
        sb.append(strB);
        sb.append(", feedKind=");
        sb.append(this.b);
        sb.append(", sportId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }

    public zos(long j, sip sipVar, long j2) {
        sipVar.getClass();
        this.f44730a = j;
        this.b = sipVar;
        this.c = j2;
    }
}
