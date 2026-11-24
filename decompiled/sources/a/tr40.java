package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tr40 implements ur40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34407a;
    public final String b;
    public final long c;
    public final long d;

    public tr40(long j, long j2, String str, String str2) {
        this.f34407a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr40)) {
            return false;
        }
        tr40 tr40Var = (tr40) obj;
        if (!this.f34407a.equals(tr40Var.f34407a) || !this.b.equals(tr40Var.b)) {
            return false;
        }
        long j = tr40Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, tr40Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f34407a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(iB, 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("Statistic(firstHeroImage=", this.f34407a, ", secondHeroImage=", this.b, ", firstHeroBorderColor="), y3d.i(this.c), ", secondHeroBorderColor=", y3d.i(this.d), Separators.RPAREN);
    }
}
