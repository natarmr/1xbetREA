package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10036a;
    public final j0g0 b;
    public final boolean c;
    public final boolean d;

    public fru0(j0g0 j0g0Var, String str, boolean z, boolean z2) {
        this.f10036a = str;
        this.b = j0g0Var;
        this.c = z;
        this.d = z2;
    }

    public static fru0 a(fru0 fru0Var, String str, j0g0 j0g0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = fru0Var.f10036a;
        }
        if ((i & 2) != 0) {
            j0g0Var = fru0Var.b;
        }
        if ((i & 4) != 0) {
            z = fru0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = fru0Var.d;
        }
        fru0Var.getClass();
        return new fru0(j0g0Var, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fru0)) {
            return false;
        }
        fru0 fru0Var = (fru0) obj;
        return this.f10036a.equals(fru0Var.f10036a) && Intrinsics.d(this.b, fru0Var.b) && this.c == fru0Var.c && this.d == fru0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f10036a.hashCode() * 31;
        j0g0 j0g0Var = this.b;
        return Boolean.hashCode(this.d) + brm0.e((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGamesCategoriesListStateModel(searchText=");
        sb.append(this.f10036a);
        sb.append(", categories=");
        sb.append(this.b);
        sb.append(", searchExpandState=");
        return ohs0.p(", connected=", Separators.RPAREN, sb, this.c, this.d);
    }
}
