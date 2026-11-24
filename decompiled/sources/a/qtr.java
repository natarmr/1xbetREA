package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qtr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29310a;
    public final long b;
    public final boolean c;
    public final ptr d;
    public final long e;
    public final long f;

    public qtr(long j, long j2, boolean z, ptr ptrVar, long j3, long j4) {
        this.f29310a = j;
        this.b = j2;
        this.c = z;
        this.d = ptrVar;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtr)) {
            return false;
        }
        qtr qtrVar = (qtr) obj;
        return this.f29310a == qtrVar.f29310a && this.b == qtrVar.b && this.c == qtrVar.c && this.d.equals(qtrVar.d) && this.e == qtrVar.e && this.f == qtrVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b((this.d.hashCode() + brm0.e(rw2.b(Long.hashCode(this.f29310a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29310a, "GameCardFooterUiModel(gameId=", ", champId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        sbQ.append(", betGroup=");
        sbQ.append(this.d);
        sbQ.append(", sportId=");
        sbQ.append(this.e);
        return rw2.n(sbQ, this.f, ", subSportId=", Separators.RPAREN);
    }
}
