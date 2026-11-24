package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35348a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final zdm0 j;
    public final nc5 k;

    public uas(long j, boolean z, boolean z2, boolean z3, List list, List list2, List list3, boolean z4, boolean z5, zdm0 zdm0Var, nc5 nc5Var) {
        b1j.B(list, list2, list3);
        this.f35348a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = z4;
        this.i = z5;
        this.j = zdm0Var;
        this.k = nc5Var;
    }

    public static uas a(uas uasVar, boolean z, boolean z2, boolean z3, ArrayList arrayList, List list, boolean z4, zdm0 zdm0Var, nc5 nc5Var, int i) {
        long j = uasVar.f35348a;
        if ((i & 2) != 0) {
            z = uasVar.b;
        }
        boolean z5 = z;
        boolean z6 = (i & 4) != 0 ? uasVar.c : z2;
        boolean z7 = (i & 8) != 0 ? uasVar.d : z3;
        List list2 = (i & 16) != 0 ? uasVar.e : arrayList;
        List list3 = (i & 32) != 0 ? uasVar.f : list;
        List list4 = uasVar.g;
        boolean z8 = (i & 128) != 0 ? uasVar.h : z4;
        boolean z9 = uasVar.i;
        zdm0 zdm0Var2 = (i & 512) != 0 ? uasVar.j : zdm0Var;
        nc5 nc5Var2 = (i & 1024) != 0 ? uasVar.k : nc5Var;
        uasVar.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new uas(j, z5, z6, z7, list2, list3, list4, z8, z9, zdm0Var2, nc5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uas)) {
            return false;
        }
        uas uasVar = (uas) obj;
        return this.f35348a == uasVar.f35348a && this.b == uasVar.b && this.c == uasVar.c && this.d == uasVar.d && Intrinsics.d(this.e, uasVar.e) && Intrinsics.d(this.f, uasVar.f) && Intrinsics.d(this.g, uasVar.g) && this.h == uasVar.h && this.i == uasVar.i && this.j.equals(uasVar.j) && this.k.equals(uasVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + kng0.a(this.j, brm0.e(brm0.e(dw9.a(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(Long.hashCode(this.f35348a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f35348a, "GameEventStateModel(sportId=", ", isLive=", this.b);
        w6x.A(", isLoading=", ", hasError=", sbR, this.c, this.d);
        hne.v(", chipUiModelList=", ", eventList=", sbR, this.e, this.f);
        esw0.k(sbR, ", dictionariesItemModelList=", this.g, ", isOnlyImportant=", this.h);
        sbR.append(", isKabbadi=");
        sbR.append(this.i);
        sbR.append(", statisticHeaderUiModel=");
        sbR.append(this.j);
        sbR.append(", backgroundHeaderModel=");
        sbR.append(this.k);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
