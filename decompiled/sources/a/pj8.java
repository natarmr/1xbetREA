package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27075a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final boolean e;

    public pj8(String str, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f27075a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = z3;
    }

    public static pj8 a(pj8 pj8Var, String str, boolean z, boolean z2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = pj8Var.f27075a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = pj8Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = pj8Var.c;
        }
        boolean z4 = z2;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = pj8Var.d;
        }
        List list2 = list;
        boolean z5 = pj8Var.e;
        pj8Var.getClass();
        list2.getClass();
        return new pj8(str2, list2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj8)) {
            return false;
        }
        pj8 pj8Var = (pj8) obj;
        return this.f27075a.equals(pj8Var.f27075a) && this.b == pj8Var.b && this.c == pj8Var.c && Intrinsics.d(this.d, pj8Var.d) && this.e == pj8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dw9.a(brm0.e(brm0.e(this.f27075a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("BonusesInfoState(gamesTitle=", this.f27075a, ", error=", this.b, ", showBio=");
        vqd.y(sbU, ", items=", this.d, ", hasGamesWildFreebet=", this.c);
        return rw2.p(sbU, this.e, Separators.RPAREN);
    }
}
