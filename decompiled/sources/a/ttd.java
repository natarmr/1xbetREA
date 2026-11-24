package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ttd implements aud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34506a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final double h;
    public final byte i;

    /* JADX WARN: Multi-variable type inference failed */
    public ttd(long j, long j2, long j3, String str, String str2, String str3, String str4, double d, int i) {
        cs0.x(str, str2, str3, str4);
        this.f34506a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = d;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttd)) {
            return false;
        }
        ttd ttdVar = (ttd) obj;
        return this.f34506a == ttdVar.f34506a && this.b == ttdVar.b && this.c == ttdVar.c && Intrinsics.d(this.d, ttdVar.d) && Intrinsics.d(this.e, ttdVar.e) && Intrinsics.d(this.f, ttdVar.f) && Intrinsics.d(this.g, ttdVar.g) && Double.compare(this.h, ttdVar.h) == 0 && this.i == ttdVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + brm0.d(this.h, ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f34506a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34506a, "EventAdded(sportId=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", couponSize=", this.c, ", matchName=");
        f140.v(sbQ, this.d, ", groupName=", this.e, ", betName=");
        f140.v(sbQ, this.f, ", coefViewName=", this.g, ", calcualtedCoef=");
        rz4.w(sbQ, this.h, ", coefViewTypeId=", this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
