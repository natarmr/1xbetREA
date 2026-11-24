package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21251a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final Set e;

    public m65(boolean z, boolean z2, List list, boolean z3, Set set) {
        list.getClass();
        set.getClass();
        this.f21251a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = set;
    }

    public static m65 a(m65 m65Var, boolean z, boolean z2, List list, boolean z3, Set set, int i) {
        if ((i & 1) != 0) {
            z = m65Var.f21251a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = m65Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            list = m65Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z3 = m65Var.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            set = m65Var.e;
        }
        Set set2 = set;
        list2.getClass();
        set2.getClass();
        return new m65(z4, z5, list2, z6, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m65)) {
            return false;
        }
        m65 m65Var = (m65) obj;
        return this.f21251a == m65Var.f21251a && this.b == m65Var.b && Intrinsics.d(this.c, m65Var.c) && this.d == m65Var.d && Intrinsics.d(this.e, m65Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(dw9.a(brm0.e(Boolean.hashCode(this.f21251a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AvailableContentState(isError=", ", isLoading=", ", games=", this.f21251a, this.b);
        rz4.z(sbQ, ", isEmpty=", this.c, ", favoriteGames=", this.d);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
