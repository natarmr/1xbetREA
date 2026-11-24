package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28897a;
    public final boolean b;
    public final boolean c;
    public final kkp0 d;
    public final long e;

    public qkp0(long j, boolean z, boolean z2, kkp0 kkp0Var, long j2) {
        this.f28897a = j;
        this.b = z;
        this.c = z2;
        this.d = kkp0Var;
        this.e = j2;
    }

    public static qkp0 a(qkp0 qkp0Var, long j, boolean z, boolean z2, kkp0 kkp0Var, long j2, int i) {
        if ((i & 1) != 0) {
            j = qkp0Var.f28897a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            z = qkp0Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = qkp0Var.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            kkp0Var = qkp0Var.d;
        }
        kkp0 kkp0Var2 = kkp0Var;
        if ((i & 16) != 0) {
            j2 = qkp0Var.e;
        }
        qkp0Var.getClass();
        return new qkp0(j3, z3, z4, kkp0Var2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkp0)) {
            return false;
        }
        qkp0 qkp0Var = (qkp0) obj;
        return this.f28897a == qkp0Var.f28897a && this.b == qkp0Var.b && this.c == qkp0Var.c && Intrinsics.d(this.d, qkp0Var.d) && this.e == qkp0Var.e;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Long.hashCode(this.f28897a) * 31, 31, this.b), 31, this.c);
        kkp0 kkp0Var = this.d;
        return Long.hashCode(this.e) + ((iE + (kkp0Var == null ? 0 : kkp0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f28897a, "TeamSquadStatisticState(sportId=", ", isLoading=", this.b);
        sbR.append(", isError=");
        sbR.append(this.c);
        sbR.append(", teamSquadStatistic=");
        sbR.append(this.d);
        return rw2.n(sbR, this.e, ", checkedChipsId=", Separators.RPAREN);
    }
}
