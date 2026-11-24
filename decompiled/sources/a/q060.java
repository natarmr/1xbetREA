package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27882a;
    public final String b;
    public final e060 c;
    public final j060 d;
    public final List e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final mdm j;
    public final qho k;

    public q060(String str, String str2, e060 e060Var, j060 j060Var, List list, List list2, List list3, boolean z, boolean z2, mdm mdmVar, qho qhoVar) {
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f27882a = str;
        this.b = str2;
        this.c = e060Var;
        this.d = j060Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = z;
        this.i = z2;
        this.j = mdmVar;
        this.k = qhoVar;
    }

    public static q060 a(q060 q060Var, e060 e060Var, j060 j060Var, List list, List list2, ArrayList arrayList, int i) {
        String str = q060Var.f27882a;
        String str2 = q060Var.b;
        if ((i & 4) != 0) {
            e060Var = q060Var.c;
        }
        e060 e060Var2 = e060Var;
        if ((i & 8) != 0) {
            j060Var = q060Var.d;
        }
        j060 j060Var2 = j060Var;
        List list3 = (i & 16) != 0 ? q060Var.e : list;
        List list4 = (i & 32) != 0 ? q060Var.f : list2;
        List list5 = (i & 64) != 0 ? q060Var.g : arrayList;
        boolean z = (i & 128) != 0 ? q060Var.h : false;
        boolean z2 = (i & 256) != 0 ? q060Var.i : false;
        mdm mdmVar = q060Var.j;
        qho qhoVar = q060Var.k;
        q060Var.getClass();
        str2.getClass();
        j060Var2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new q060(str, str2, e060Var2, j060Var2, list3, list4, list5, z, z2, mdmVar, qhoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q060) {
            q060 q060Var = (q060) obj;
            return this.f27882a.equals(q060Var.f27882a) && Intrinsics.d(this.b, q060Var.b) && Intrinsics.d(this.c, q060Var.c) && this.d.equals(q060Var.d) && Intrinsics.d(this.e, q060Var.e) && Intrinsics.d(this.f, q060Var.f) && Intrinsics.d(this.g, q060Var.g) && this.h == q060Var.h && this.i == q060Var.i && this.j.equals(q060Var.j) && this.k == q060Var.k;
        }
        return false;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f27882a.hashCode() * 31, 31, this.b);
        e060 e060Var = this.c;
        return this.k.hashCode() + f140.d(this.j, brm0.e(brm0.e(dw9.a(dw9.a(dw9.a((this.d.hashCode() + ((iB + (e060Var == null ? 0 : e060Var.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NoTabsDashboardFiltersState(screenName=", this.f27882a, ", title=", this.b, ", config=");
        sbN.append(this.c);
        sbN.append(", filtersElementsConfig=");
        sbN.append(this.d);
        sbN.append(", currentFiltersOrder=");
        b1j.y(", savedFiltersOrder=", ", defaultFiltersOrder=", sbN, this.e, this.f);
        rz4.z(sbN, ", connectionError=", this.g, ", showLoading=", this.h);
        sbN.append(this.i);
        sbN.append(", lottieConfigConnectionError=");
        sbN.append(this.j);
        sbN.append(", eventStyledDrawableProvider=");
        sbN.append(this.k);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
