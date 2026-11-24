package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class svg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32864a;
    public final float b;
    public final float c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final xtg0 o;
    public final wvg0 p;
    public final ytg0 q;
    public final a5w r;
    public final ql5 s;
    public final List t;
    public final List u;
    public final List v;
    public final SaleScreenModel w;

    public svg0(float f, float f2, float f3, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2, boolean z3, boolean z4, xtg0 xtg0Var, wvg0 wvg0Var, ytg0 ytg0Var, a5w a5wVar, ql5 ql5Var, List list, List list2, List list3, SaleScreenModel saleScreenModel) {
        b1j.B(list, list2, list3);
        this.f32864a = f;
        this.b = f2;
        this.c = f3;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d5;
        this.i = d6;
        this.j = d7;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = xtg0Var;
        this.p = wvg0Var;
        this.q = ytg0Var;
        this.r = a5wVar;
        this.s = ql5Var;
        this.t = list;
        this.u = list2;
        this.v = list3;
        this.w = saleScreenModel;
    }

    public static svg0 a(svg0 svg0Var, float f, float f2, float f3, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2, xtg0 xtg0Var, wvg0 wvg0Var, ytg0 ytg0Var, ql5 ql5Var, List list, List list2, int i) {
        float f4 = (i & 1) != 0 ? svg0Var.f32864a : f;
        float f5 = (i & 2) != 0 ? svg0Var.b : f2;
        float f6 = (i & 4) != 0 ? svg0Var.c : f3;
        double d8 = (i & 8) != 0 ? svg0Var.d : d;
        double d9 = (i & 16) != 0 ? svg0Var.e : d2;
        double d10 = (i & 32) != 0 ? svg0Var.f : d3;
        double d11 = (i & 64) != 0 ? svg0Var.g : d4;
        double d12 = (i & 128) != 0 ? svg0Var.h : d5;
        double d13 = (i & 256) != 0 ? svg0Var.i : d6;
        double d14 = (i & 512) != 0 ? svg0Var.j : d7;
        boolean z3 = svg0Var.k;
        boolean z4 = (i & 2048) != 0 ? svg0Var.l : z;
        boolean z5 = svg0Var.m;
        boolean z6 = (i & 8192) != 0 ? svg0Var.n : z2;
        xtg0 xtg0Var2 = (i & 16384) != 0 ? svg0Var.o : xtg0Var;
        wvg0 wvg0Var2 = (32768 & i) != 0 ? svg0Var.p : wvg0Var;
        ytg0 ytg0Var2 = (65536 & i) != 0 ? svg0Var.q : ytg0Var;
        a5w a5wVar = svg0Var.r;
        ql5 ql5Var2 = (i & 262144) != 0 ? svg0Var.s : ql5Var;
        List list3 = svg0Var.t;
        List list4 = (i & 1048576) != 0 ? svg0Var.u : list;
        List list5 = (i & 2097152) != 0 ? svg0Var.v : list2;
        SaleScreenModel saleScreenModel = svg0Var.w;
        svg0Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new svg0(f4, f5, f6, d8, d9, d10, d11, d12, d13, d14, z3, z4, z5, z6, xtg0Var2, wvg0Var2, ytg0Var2, a5wVar, ql5Var2, list3, list4, list5, saleScreenModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svg0)) {
            return false;
        }
        svg0 svg0Var = (svg0) obj;
        return Float.compare(this.f32864a, svg0Var.f32864a) == 0 && Float.compare(this.b, svg0Var.b) == 0 && Float.compare(this.c, svg0Var.c) == 0 && Double.compare(this.d, svg0Var.d) == 0 && Double.compare(this.e, svg0Var.e) == 0 && Double.compare(this.f, svg0Var.f) == 0 && Double.compare(this.g, svg0Var.g) == 0 && Double.compare(this.h, svg0Var.h) == 0 && Double.compare(this.i, svg0Var.i) == 0 && Double.compare(this.j, svg0Var.j) == 0 && this.k == svg0Var.k && this.l == svg0Var.l && this.m == svg0Var.m && this.n == svg0Var.n && this.o.equals(svg0Var.o) && this.p == svg0Var.p && Intrinsics.d(this.q, svg0Var.q) && Intrinsics.d(this.r, svg0Var.r) && Intrinsics.d(this.s, svg0Var.s) && Intrinsics.d(this.t, svg0Var.t) && Intrinsics.d(this.u, svg0Var.u) && Intrinsics.d(this.v, svg0Var.v) && this.w.equals(svg0Var.w);
    }

    public final int hashCode() {
        int iHashCode = (this.p.hashCode() + ((this.o.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.d(this.j, brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, defpackage.c.a(defpackage.c.a(Float.hashCode(this.f32864a) * 31, this.b, 31), this.c, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31)) * 31;
        ytg0 ytg0Var = this.q;
        int iHashCode2 = (iHashCode + (ytg0Var == null ? 0 : ytg0Var.hashCode())) * 31;
        a5w a5wVar = this.r;
        int iHashCode3 = (iHashCode2 + (a5wVar == null ? 0 : a5wVar.hashCode())) * 31;
        ql5 ql5Var = this.s;
        return this.w.hashCode() + dw9.a(dw9.a(dw9.a((iHashCode3 + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31, 31, this.t), 31, this.u), 31, this.v);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f32864a, this.b, "SaleState(newStakeProgress=", ", paymentProgress=", ", autoSaleProgress=");
        sbS.append(this.c);
        sbS.append(", maxBetValue=");
        sbS.append(this.d);
        ohs0.A(sbS, this.e, ", minBetValue=", ", newStakeSum=");
        sbS.append(this.f);
        ohs0.A(sbS, this.g, ", paymentSum=", ", autoSaleSum=");
        sbS.append(this.h);
        ohs0.A(sbS, this.i, ", minAutoSaleSum=", ", maxAutoSaleSum=");
        rz4.x(sbS, this.j, ", isTransactionEnable=", this.k);
        w6x.A(", isFullScreenLoader=", ", hasBetSellRoundValue=", sbS, this.l, this.m);
        sbS.append(", lastConnection=");
        sbS.append(this.n);
        sbS.append(", saleBetState=");
        sbS.append(this.o);
        sbS.append(", saleTypeScreen=");
        sbS.append(this.p);
        sbS.append(", saleBetSumModel=");
        sbS.append(this.q);
        sbS.append(", historyModel=");
        sbS.append(this.r);
        sbS.append(", balanceModel=");
        sbS.append(this.s);
        hne.v(", specialEvent=", ", eventGroupsList=", sbS, this.t, this.u);
        sbS.append(", eventModelList=");
        sbS.append(this.v);
        sbS.append(", saleScreenModel=");
        sbS.append(this.w);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
