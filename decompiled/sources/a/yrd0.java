package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yrd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43117a;
    public final boolean b;
    public final zsd0 c;
    public final long d;

    public yrd0(boolean z, boolean z2, zsd0 zsd0Var, long j) {
        this.f43117a = z;
        this.b = z2;
        this.c = zsd0Var;
        this.d = j;
    }

    public static yrd0 a(yrd0 yrd0Var, boolean z, boolean z2, zsd0 zsd0Var, long j, int i) {
        if ((i & 1) != 0) {
            z = yrd0Var.f43117a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = yrd0Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            zsd0Var = yrd0Var.c;
        }
        zsd0 zsd0Var2 = zsd0Var;
        if ((i & 8) != 0) {
            j = yrd0Var.d;
        }
        yrd0Var.getClass();
        return new yrd0(z3, z4, zsd0Var2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrd0)) {
            return false;
        }
        yrd0 yrd0Var = (yrd0) obj;
        return this.f43117a == yrd0Var.f43117a && this.b == yrd0Var.b && Intrinsics.d(this.c, yrd0Var.c) && this.d == yrd0Var.d;
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f43117a) * 31, 31, this.b);
        zsd0 zsd0Var = this.c;
        return Long.hashCode(this.d) + ((iE + (zsd0Var == null ? 0 : zsd0Var.f44901a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RaceResultState(isLoading=", ", isError=", ", racesResultsModel=", this.f43117a, this.b);
        sbQ.append(this.c);
        sbQ.append(", checkedChipsId=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
