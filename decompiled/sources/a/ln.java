package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20320a;
    public final j0g0 b;
    public final boolean c;
    public final String d;

    public ln(j0g0 j0g0Var, String str, boolean z, boolean z2) {
        this.f20320a = z;
        this.b = j0g0Var;
        this.c = z2;
        this.d = str;
    }

    public static ln a(ln lnVar, boolean z, j0g0 j0g0Var, boolean z2, String str, int i) {
        if ((i & 1) != 0) {
            z = lnVar.f20320a;
        }
        if ((i & 2) != 0) {
            j0g0Var = lnVar.b;
        }
        if ((i & 4) != 0) {
            z2 = lnVar.c;
        }
        if ((i & 8) != 0) {
            str = lnVar.d;
        }
        lnVar.getClass();
        return new ln(j0g0Var, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        return this.f20320a == lnVar.f20320a && Intrinsics.d(this.b, lnVar.b) && this.c == lnVar.c && this.d.equals(lnVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f20320a) * 31;
        j0g0 j0g0Var = this.b;
        return this.d.hashCode() + brm0.e((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveTeamsStateModel(connected=");
        sb.append(this.f20320a);
        sb.append(", activeTeamsResult=");
        sb.append(this.b);
        sb.append(", searchExpandState=");
        return twn.q(", searchText=", this.d, Separators.RPAREN, sb, this.c);
    }
}
