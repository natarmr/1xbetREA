package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class msl0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22327a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final zrm e;

    public msl0(long j, String str, boolean z, boolean z2, zrm zrmVar) {
        str.getClass();
        this.f22327a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = zrmVar;
    }

    public static msl0 c(msl0 msl0Var, boolean z, boolean z2, zrm zrmVar, int i) {
        long j = msl0Var.f22327a;
        String str = msl0Var.b;
        if ((i & 4) != 0) {
            z = msl0Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = msl0Var.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            zrmVar = msl0Var.e;
        }
        msl0Var.getClass();
        str.getClass();
        return new msl0(j, str, z3, z4, zrmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msl0)) {
            return false;
        }
        msl0 msl0Var = (msl0) obj;
        return this.f22327a == msl0Var.f22327a && Intrinsics.d(this.b, msl0Var.b) && this.c == msl0Var.c && this.d == msl0Var.d && this.e.equals(msl0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(ua80.b(Long.hashCode(this.f22327a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f22327a, "SportsFilterUiModel(id=", ", name=", this.b);
        w6x.A(", checked=", ", disableCheck=", sbO, this.c, this.d);
        sbO.append(", style=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
