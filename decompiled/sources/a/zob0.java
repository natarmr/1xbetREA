package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44711a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final a5w g;
    public final cit0 h;
    public final String i;
    public final ql5 j;
    public final sob0 k;
    public final List l;
    public final List m;
    public final List n;

    public zob0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, a5w a5wVar, cit0 cit0Var, String str2, ql5 ql5Var, sob0 sob0Var, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f44711a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = a5wVar;
        this.h = cit0Var;
        this.i = str2;
        this.j = ql5Var;
        this.k = sob0Var;
        this.l = list;
        this.m = list2;
        this.n = list3;
    }

    public static zob0 a(zob0 zob0Var, boolean z, boolean z2, cit0 cit0Var, String str, ql5 ql5Var, sob0 sob0Var, List list, List list2, int i) {
        boolean z3 = (i & 1) != 0 ? zob0Var.f44711a : z;
        boolean z4 = (i & 2) != 0 ? zob0Var.b : z2;
        boolean z5 = zob0Var.c;
        boolean z6 = zob0Var.d;
        boolean z7 = zob0Var.e;
        String str2 = zob0Var.f;
        zob0Var.getClass();
        a5w a5wVar = zob0Var.g;
        cit0 cit0Var2 = (i & 256) != 0 ? zob0Var.h : cit0Var;
        String str3 = (i & 512) != 0 ? zob0Var.i : str;
        ql5 ql5Var2 = (i & 1024) != 0 ? zob0Var.j : ql5Var;
        sob0 sob0Var2 = (i & 2048) != 0 ? zob0Var.k : sob0Var;
        List list3 = zob0Var.l;
        List list4 = (i & 8192) != 0 ? zob0Var.m : list;
        List list5 = (i & 16384) != 0 ? zob0Var.n : list2;
        zob0Var.getClass();
        str3.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new zob0(z3, z4, z5, z6, z7, str2, a5wVar, cit0Var2, str3, ql5Var2, sob0Var2, list3, list4, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zob0)) {
            return false;
        }
        zob0 zob0Var = (zob0) obj;
        return this.f44711a == zob0Var.f44711a && this.b == zob0Var.b && this.c == zob0Var.c && this.d == zob0Var.d && this.e == zob0Var.e && this.f.equals(zob0Var.f) && Intrinsics.d(this.g, zob0Var.g) && Intrinsics.d(this.h, zob0Var.h) && this.i.equals(zob0Var.i) && Intrinsics.d(this.j, zob0Var.j) && this.k.equals(zob0Var.k) && Intrinsics.d(this.l, zob0Var.l) && Intrinsics.d(this.m, zob0Var.m) && Intrinsics.d(this.n, zob0Var.n);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f44711a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 961, this.f);
        a5w a5wVar = this.g;
        int iHashCode = (iB + (a5wVar == null ? 0 : a5wVar.hashCode())) * 31;
        cit0 cit0Var = this.h;
        int iB2 = ua80.b((iHashCode + (cit0Var == null ? 0 : cit0Var.hashCode())) * 31, 31, this.i);
        ql5 ql5Var = this.j;
        return this.n.hashCode() + dw9.a(dw9.a((this.k.hashCode() + ((iB2 + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31)) * 31, 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PowerBetState(lastConnection=", ", isFullLoading=", ", logNewEventParams=", this.f44711a, this.b);
        ua80.u(", isNewEventParams=", ", showParsingNumber=", sbQ, this.c, this.d);
        f140.s(", betId=", this.f, ", powerBetUiModel=null, historyModel=", sbQ, this.e);
        sbQ.append(this.g);
        sbQ.append(", updateCouponModel=");
        sbQ.append(this.h);
        sbQ.append(", exceptionText=");
        sbQ.append(this.i);
        sbQ.append(", balanceModel=");
        sbQ.append(this.j);
        sbQ.append(", powerBetModelState=");
        sbQ.append(this.k);
        sbQ.append(", specialEvent=");
        sbQ.append(this.l);
        sbQ.append(", eventGroupsList=");
        return kng0.n(", eventModelList=", Separators.RPAREN, sbQ, this.m, this.n);
    }
}
