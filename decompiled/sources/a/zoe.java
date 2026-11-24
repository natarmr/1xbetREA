package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44716a;
    public final long b;
    public final String c;
    public final qpe d;

    public zoe(long j, long j2, String str, qpe qpeVar) {
        this.f44716a = j;
        this.b = j2;
        this.c = str;
        this.d = qpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoe)) {
            return false;
        }
        zoe zoeVar = (zoe) obj;
        return this.f44716a == zoeVar.f44716a && this.b == zoeVar.b && this.c.equals(zoeVar.c) && this.d == zoeVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(Long.hashCode(this.f44716a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f44716a, "CounterModel(expireSeconds=", ", eventDate=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        sbQ.append(", type=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
