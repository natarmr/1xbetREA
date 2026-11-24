package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34584a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tv6(String str, String str2, String str3, String str4, long j) {
        cs0.x(str, str2, str3, str4);
        this.f34584a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv6)) {
            return false;
        }
        tv6 tv6Var = (tv6) obj;
        return this.f34584a == tv6Var.f34584a && Intrinsics.d(this.b, tv6Var.b) && Intrinsics.d(this.c, tv6Var.c) && Intrinsics.d(this.d, tv6Var.d) && Intrinsics.d(this.e, tv6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f34584a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34584a, "BetEventSubtitle(timeStart=", ", vid=", this.b);
        f140.v(sbO, ", fullName=", this.c, ", gameType=", this.d);
        return rw2.o(sbO, ", gameVid=", this.e, Separators.RPAREN);
    }
}
