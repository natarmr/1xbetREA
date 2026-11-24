package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vtd implements aud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38000a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final double g;
    public final byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public vtd(long j, long j2, String str, String str2, String str3, String str4, double d, int i) {
        cs0.x(str, str2, str3, str4);
        this.f38000a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = d;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtd)) {
            return false;
        }
        vtd vtdVar = (vtd) obj;
        return this.f38000a == vtdVar.f38000a && this.b == vtdVar.b && Intrinsics.d(this.c, vtdVar.c) && Intrinsics.d(this.d, vtdVar.d) && Intrinsics.d(this.e, vtdVar.e) && Intrinsics.d(this.f, vtdVar.f) && Double.compare(this.g, vtdVar.g) == 0 && this.h == vtdVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + brm0.d(this.g, ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f38000a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f38000a, "EventChanged(sportId=", ", subSportId=");
        kng0.z(sbQ, this.b, ", matchName=", this.c);
        f140.v(sbQ, ", groupName=", this.d, ", betName=", this.e);
        hne.B(sbQ, ", coefViewName=", this.f, ", calcualtedCoef=");
        rz4.w(sbQ, this.g, ", coefViewTypeId=", this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
