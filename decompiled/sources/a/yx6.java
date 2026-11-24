package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43405a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final long h;
    public final String i;
    public final List j;
    public final List k;

    public yx6(long j, String str, long j2, long j3, String str2, String str3, boolean z, long j4, String str4, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f43405a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = j4;
        this.i = str4;
        this.j = list;
        this.k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx6)) {
            return false;
        }
        yx6 yx6Var = (yx6) obj;
        return this.f43405a == yx6Var.f43405a && Intrinsics.d(this.b, yx6Var.b) && this.c == yx6Var.c && this.d == yx6Var.d && Intrinsics.d(this.e, yx6Var.e) && Intrinsics.d(this.f, yx6Var.f) && this.g == yx6Var.g && this.h == yx6Var.h && this.i.equals(yx6Var.i) && Intrinsics.d(this.j, yx6Var.j) && Intrinsics.d(this.k, yx6Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(ua80.b(rw2.b(brm0.e(ua80.b(ua80.b(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f43405a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43405a, "BetGameDataModel(sportId=", ", champName=", this.b);
        kng0.A(sbO, ", subGameId=", this.c, ", champId=");
        kng0.z(sbO, this.d, ", teamOneName=", this.e);
        w6x.z(", teamTwoName=", this.f, ", live=", sbO, this.g);
        kng0.A(sbO, ", timeStart=", this.h, ", periodName=");
        cs0.y(this.i, ", firstTeamImages=", ", secondTeamImages=", sbO, this.j);
        return dw9.r(sbO, this.k, Separators.RPAREN);
    }
}
