package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ssr implements usr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32739a;
    public final long b;
    public final String c;
    public final long d;

    public ssr(long j, long j2, long j3, String str) {
        this.f32739a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
    }

    @Override // a.usr
    public final long a() {
        return this.f32739a;
    }

    @Override // a.usr
    public final long c() {
        return this.b;
    }

    @Override // a.usr
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssr)) {
            return false;
        }
        ssr ssrVar = (ssr) obj;
        return this.f32739a == ssrVar.f32739a && this.b == ssrVar.b && this.c.equals(ssrVar.c) && this.d == ssrVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ua80.b(rw2.b(Long.hashCode(this.f32739a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32739a, "Video(gameId=", ", sportId=");
        kng0.z(sbQ, this.b, ", videoId=", this.c);
        return rw2.n(sbQ, this.d, ", subSportId=", Separators.RPAREN);
    }
}
