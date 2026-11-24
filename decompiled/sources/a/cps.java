package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cps implements gps {
    public static final bps Companion = new bps();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new o9s(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4763a;
    public final sip b;
    public final long c;
    public final long d;

    public /* synthetic */ cps(int i, bds bdsVar, sip sipVar, long j, wen wenVar) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, aps.f1268a.getDescriptor());
            throw null;
        }
        this.f4763a = bdsVar.f2414a;
        this.b = sipVar;
        this.c = j;
        this.d = wenVar.f39026a;
    }

    @Override // a.gps
    public final sip E() {
        return this.b;
    }

    @Override // a.gps
    public final long Y() {
        return this.f4763a;
    }

    @Override // a.gps
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cps)) {
            return false;
        }
        cps cpsVar = (cps) obj;
        return bds.a(this.f4763a, cpsVar.f4763a) && this.b == cpsVar.b && this.c == cpsVar.c && wen.d(this.d, cpsVar.d);
    }

    public final int hashCode() {
        int iB = rw2.b((this.b.hashCode() + (Long.hashCode(this.f4763a) * 31)) * 31, 31, this.c);
        uen uenVar = wen.b;
        return Long.hashCode(this.d) + iB;
    }

    public final String toString() {
        String strB = bds.b(this.f4763a);
        String strM = wen.m(this.d);
        StringBuilder sb = new StringBuilder("FindLive(gameId=");
        sb.append(strB);
        sb.append(", feedKind=");
        sb.append(this.b);
        sb.append(", sportId=");
        kng0.z(sb, this.c, ", before=", strM);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public cps(long j, long j2, long j3) {
        sip sipVar = sip.c;
        this.f4763a = j;
        this.b = sipVar;
        this.c = j2;
        this.d = j3;
    }
}
