package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class n85 extends ipm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23073a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final wuo0 g;
    public final sba0 h;
    public final tba0 i;
    public final double j;
    public final huo0 k;
    public final suo0 l;

    public n85(long j, long j2, String str, String str2, long j3, String str3, wuo0 wuo0Var, sba0 sba0Var, tba0 tba0Var, double d, huo0 huo0Var, suo0 suo0Var) {
        this.f23073a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = str3;
        this.g = wuo0Var;
        this.h = sba0Var;
        this.i = tba0Var;
        this.j = d;
        this.k = huo0Var;
        this.l = suo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85)) {
            return false;
        }
        n85 n85Var = (n85) obj;
        return this.f23073a == n85Var.f23073a && this.b == n85Var.b && this.c.equals(n85Var.c) && this.d.equals(n85Var.d) && this.e == n85Var.e && this.f.equals(n85Var.f) && this.g == n85Var.g && this.h == n85Var.h && this.i == n85Var.i && Double.compare(this.j, n85Var.j) == 0 && this.k.equals(n85Var.k) && this.l.equals(n85Var.l);
    }

    @Override // a.ipm0
    public final huo0 h() {
        return this.k;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + brm0.d(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f23073a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31, 31)) * 31);
    }

    @Override // a.ipm0
    public final sba0 j() {
        return this.h;
    }

    @Override // a.ipm0
    public final suo0 k() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f23073a, "AvailableTaskModel(secondsToStart=", ", secondsToEnd=");
        kng0.z(sbQ, this.b, ", dtStart=", this.c);
        hne.B(sbQ, ", dtEnd=", this.d, ", id=");
        kng0.z(sbQ, this.e, ", name=", this.f);
        sbQ.append(", status=");
        sbQ.append(this.g);
        sbQ.append(", kind=");
        sbQ.append(this.h);
        sbQ.append(", type=");
        sbQ.append(this.i);
        sbQ.append(", percentCompleted=");
        sbQ.append(this.j);
        sbQ.append(", condition=");
        sbQ.append(this.k);
        sbQ.append(", prize=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
