package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wtd implements aud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39734a;
    public final long b;
    public final long c;

    public wtd(long j, long j2, long j3) {
        this.f39734a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtd)) {
            return false;
        }
        wtd wtdVar = (wtd) obj;
        return this.f39734a == wtdVar.f39734a && this.b == wtdVar.b && this.c == wtdVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f39734a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f39734a, "EventDeleted(gameId=", ", sportId=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", subSportId=", Separators.RPAREN);
    }
}
