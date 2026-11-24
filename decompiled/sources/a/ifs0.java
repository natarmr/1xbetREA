package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ifs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14704a;
    public final lgs0 b;
    public final a5w c;
    public final ql5 d;
    public final boolean e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;

    public ifs0(boolean z, lgs0 lgs0Var, a5w a5wVar, ql5 ql5Var, boolean z2, List list, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f14704a = z;
        this.b = lgs0Var;
        this.c = a5wVar;
        this.d = ql5Var;
        this.e = z2;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
    }

    public static ifs0 a(ifs0 ifs0Var, boolean z, lgs0 lgs0Var, ql5 ql5Var, boolean z2, List list, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            z = ifs0Var.f14704a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            lgs0Var = ifs0Var.b;
        }
        lgs0 lgs0Var2 = lgs0Var;
        a5w a5wVar = ifs0Var.c;
        if ((i & 8) != 0) {
            ql5Var = ifs0Var.d;
        }
        ql5 ql5Var2 = ql5Var;
        boolean z4 = (i & 16) != 0 ? ifs0Var.e : z2;
        List list4 = ifs0Var.f;
        List list5 = (i & 64) != 0 ? ifs0Var.g : list;
        List list6 = (i & 128) != 0 ? ifs0Var.h : list2;
        List list7 = (i & 256) != 0 ? ifs0Var.i : list3;
        ifs0Var.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        return new ifs0(z3, lgs0Var2, a5wVar, ql5Var2, z4, list4, list5, list6, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifs0)) {
            return false;
        }
        ifs0 ifs0Var = (ifs0) obj;
        return this.f14704a == ifs0Var.f14704a && this.b.equals(ifs0Var.b) && Intrinsics.d(this.c, ifs0Var.c) && Intrinsics.d(this.d, ifs0Var.d) && this.e == ifs0Var.e && Intrinsics.d(this.f, ifs0Var.f) && Intrinsics.d(this.g, ifs0Var.g) && Intrinsics.d(this.h, ifs0Var.h) && Intrinsics.d(this.i, ifs0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f14704a) * 31)) * 31;
        a5w a5wVar = this.c;
        int iHashCode2 = (iHashCode + (a5wVar == null ? 0 : a5wVar.hashCode())) * 31;
        ql5 ql5Var = this.d;
        return this.i.hashCode() + dw9.a(dw9.a(dw9.a(brm0.e((iHashCode2 + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransactionHistoryState(lastConnection=");
        sb.append(this.f14704a);
        sb.append(", transactionState=");
        sb.append(this.b);
        sb.append(", historyModel=");
        sb.append(this.c);
        sb.append(", balanceModel=");
        sb.append(this.d);
        sb.append(", pullToRefreshState=");
        vqd.y(sb, ", specialEvent=", this.f, ", eventGroupsList=", this.e);
        b1j.y(", eventModelList=", ", transactionHistory=", sb, this.g, this.h);
        return dw9.r(sb, this.i, Separators.RPAREN);
    }
}
