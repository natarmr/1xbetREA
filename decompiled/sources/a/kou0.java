package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18647a;
    public final j0g0 b;
    public final boolean c;
    public final boolean d;

    public kou0(j0g0 j0g0Var, String str, boolean z, boolean z2) {
        this.f18647a = str;
        this.b = j0g0Var;
        this.c = z;
        this.d = z2;
    }

    public static kou0 a(kou0 kou0Var, String str, j0g0 j0g0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = kou0Var.f18647a;
        }
        if ((i & 2) != 0) {
            j0g0Var = kou0Var.b;
        }
        if ((i & 4) != 0) {
            z = kou0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = kou0Var.d;
        }
        kou0Var.getClass();
        return new kou0(j0g0Var, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kou0)) {
            return false;
        }
        kou0 kou0Var = (kou0) obj;
        return this.f18647a.equals(kou0Var.f18647a) && Intrinsics.d(this.b, kou0Var.b) && this.c == kou0Var.c && this.d == kou0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f18647a.hashCode() * 31;
        j0g0 j0g0Var = this.b;
        return Boolean.hashCode(this.d) + brm0.e((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGameCategoryDisciplinesStateModel(searchText=");
        sb.append(this.f18647a);
        sb.append(", categorySports=");
        sb.append(this.b);
        sb.append(", searchExpandState=");
        return ohs0.p(", connected=", Separators.RPAREN, sb, this.c, this.d);
    }
}
