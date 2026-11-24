package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ua5 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35314a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final jd6 h;
    public final a4x i;

    public ua5(String str, long j, String str2, String str3, String str4, boolean z, int i, jd6 jd6Var, a4x a4xVar) {
        w6x.x(a4xVar, str, str4);
        this.f35314a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = i;
        this.h = jd6Var;
        this.i = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua5)) {
            return false;
        }
        ua5 ua5Var = (ua5) obj;
        return Intrinsics.d(this.f35314a, ua5Var.f35314a) && this.b == ua5Var.b && this.c.equals(ua5Var.c) && this.d.equals(ua5Var.d) && Intrinsics.d(this.e, ua5Var.e) && this.f == ua5Var.f && this.g == ua5Var.g && this.h.equals(ua5Var.h) && Intrinsics.d(this.i, ua5Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + twn.a(this.g, brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(this.f35314a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "AwardNominantUiModel(id=", this.f35314a, ", playerId=");
        f140.v(sbO, ", playerName=", this.c, ", playerImage=", this.d);
        w6x.z(", place=", this.e, ", expanded=", sbO, this.f);
        sbO.append(", arrowIcon=");
        sbO.append(this.g);
        sbO.append(", betPlayer=");
        sbO.append(this.h);
        sbO.append(", awardNominantStatInfo=");
        sbO.append(this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
