package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gvn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11984a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final List f;
    public final Set g;
    public final mdm h;

    public gvn0(boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, Set set, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        set.getClass();
        this.f11984a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = list2;
        this.g = set;
        this.h = mdmVar;
    }

    public static gvn0 a(gvn0 gvn0Var, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, Set set, int i) {
        if ((i & 1) != 0) {
            z = gvn0Var.f11984a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = gvn0Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = gvn0Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = gvn0Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            list = gvn0Var.e;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = gvn0Var.f;
        }
        List list4 = list2;
        Set set2 = (i & 64) != 0 ? gvn0Var.g : set;
        mdm mdmVar = gvn0Var.h;
        gvn0Var.getClass();
        list3.getClass();
        list4.getClass();
        set2.getClass();
        return new gvn0(z5, z6, z7, z8, list3, list4, set2, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvn0)) {
            return false;
        }
        gvn0 gvn0Var = (gvn0) obj;
        return this.f11984a == gvn0Var.f11984a && this.b == gvn0Var.b && this.c == gvn0Var.c && this.d == gvn0Var.d && Intrinsics.d(this.e, gvn0Var.e) && Intrinsics.d(this.f, gvn0Var.f) && Intrinsics.d(this.g, gvn0Var.g) && this.h.equals(gvn0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ohs0.g(this.g, dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f11984a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SwipexFilterState(error=", ", loading=", ", haveSavedSports=", this.f11984a, this.b);
        ua80.u(", enableConfirmButton=", ", champs=", sbQ, this.c, this.d);
        b1j.y(", sports=", ", expandedSportIds=", sbQ, this.e, this.f);
        sbQ.append(this.g);
        sbQ.append(", lottieConfig=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
