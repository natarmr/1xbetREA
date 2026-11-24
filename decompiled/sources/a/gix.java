package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11370a;
    public final long b;
    public final long c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final int g;

    public gix(int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        this.f11370a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = i;
        this.f = z2;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gix)) {
            return false;
        }
        gix gixVar = (gix) obj;
        return this.f11370a == gixVar.f11370a && this.b == gixVar.b && this.c == gixVar.c && this.d == gixVar.d && this.e == gixVar.e && this.f == gixVar.f && this.g == gixVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + brm0.e(twn.a(this.e, brm0.e(rw2.b(rw2.b(Long.hashCode(this.f11370a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f11370a, "InsightsRequestModel(sportId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", userId=", this.c, ", cutCoef=");
        ua80.q(this.e, ", country=", ", fCountry=", sbQ, this.d);
        sbQ.append(this.f);
        sbQ.append(", coefTypeId=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
