package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fps implements gps {
    public static final eps Companion = new eps();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9943a;
    public final sip b;
    public final long c;
    public final sos d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, maz.a(wezVar, new o9s((byte) 22)), null, maz.a(wezVar, new o9s((byte) 23))};
    }

    public /* synthetic */ fps(int i, bds bdsVar, sip sipVar, long j, sos sosVar) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, dps.f6481a.getDescriptor());
            throw null;
        }
        this.f9943a = bdsVar.f2414a;
        this.b = sipVar;
        this.c = j;
        this.d = sosVar;
    }

    @Override // a.gps
    public final sip E() {
        return this.b;
    }

    @Override // a.gps
    public final long Y() {
        return this.f9943a;
    }

    @Override // a.gps
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fps)) {
            return false;
        }
        fps fpsVar = (fps) obj;
        return bds.a(this.f9943a, fpsVar.f9943a) && this.b == fpsVar.b && this.c == fpsVar.c && this.d == fpsVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b((this.b.hashCode() + (Long.hashCode(this.f9943a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Stopped(gameId=" + bds.b(this.f9943a) + ", feedKind=" + this.b + ", sportId=" + this.c + ", entryReason=" + this.d + Separators.RPAREN;
    }

    public fps(long j, sip sipVar, long j2, sos sosVar) {
        sipVar.getClass();
        this.f9943a = j;
        this.b = sipVar;
        this.c = j2;
        this.d = sosVar;
    }
}
