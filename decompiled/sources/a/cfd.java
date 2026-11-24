package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4255a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public cfd(long j, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f4255a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public static cfd a(cfd cfdVar, long j, boolean z, boolean z2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            j = cfdVar.f4255a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = cfdVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = cfdVar.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = cfdVar.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            list = cfdVar.e;
        }
        List list2 = list;
        cfdVar.getClass();
        list2.getClass();
        return new cfd(j2, list2, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfd)) {
            return false;
        }
        cfd cfdVar = (cfd) obj;
        return this.f4255a == cfdVar.f4255a && this.b == cfdVar.b && this.c == cfdVar.c && this.d == cfdVar.d && Intrinsics.d(this.e, cfdVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Long.hashCode(this.f4255a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f4255a, "CompletedMatchesTeamState(sportId=", ", isLoading=", this.b);
        w6x.A(", isError=", ", isEmpty=", sbR, this.c, this.d);
        return ohs0.s(sbR, ", matchesResultList=", this.e, Separators.RPAREN);
    }
}
