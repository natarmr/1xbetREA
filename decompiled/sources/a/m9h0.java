package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jug0 f21410a;
    public final msv b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final hje l;
    public final int m;

    public m9h0(jug0 jug0Var, msv msvVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, hje hjeVar, int i4) {
        jug0Var.getClass();
        this.f21410a = jug0Var;
        this.b = msvVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = str;
        this.l = hjeVar;
        this.m = i4;
    }

    public static m9h0 a(m9h0 m9h0Var, jug0 jug0Var, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, hje hjeVar, int i4, int i5) {
        if ((i5 & 1) != 0) {
            jug0Var = m9h0Var.f21410a;
        }
        jug0 jug0Var2 = jug0Var;
        msv msvVar = m9h0Var.b;
        int i6 = (i5 & 4) != 0 ? m9h0Var.c : i;
        int i7 = (i5 & 8) != 0 ? m9h0Var.d : i2;
        int i8 = (i5 & 16) != 0 ? m9h0Var.e : i3;
        boolean z6 = (i5 & 32) != 0 ? m9h0Var.f : z;
        boolean z7 = (i5 & 64) != 0 ? m9h0Var.g : z2;
        boolean z8 = (i5 & 128) != 0 ? m9h0Var.h : z3;
        boolean z9 = (i5 & 256) != 0 ? m9h0Var.i : z4;
        boolean z10 = (i5 & 512) != 0 ? m9h0Var.j : z5;
        String str2 = (i5 & 1024) != 0 ? m9h0Var.k : str;
        hje hjeVar2 = (i5 & 2048) != 0 ? m9h0Var.l : hjeVar;
        int i9 = (i5 & 4096) != 0 ? m9h0Var.m : i4;
        m9h0Var.getClass();
        jug0Var2.getClass();
        return new m9h0(jug0Var2, msvVar, i6, i7, i8, z6, z7, z8, z9, z10, str2, hjeVar2, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9h0)) {
            return false;
        }
        m9h0 m9h0Var = (m9h0) obj;
        return Intrinsics.d(this.f21410a, m9h0Var.f21410a) && this.b.equals(m9h0Var.b) && this.c == m9h0Var.c && this.d == m9h0Var.d && this.e == m9h0Var.e && this.f == m9h0Var.f && this.g == m9h0Var.g && this.h == m9h0Var.h && this.i == m9h0Var.i && this.j == m9h0Var.j && this.k.equals(m9h0Var.k) && this.l.equals(m9h0Var.l) && this.m == m9h0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + ((this.l.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.e, twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f21410a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenUiState(saleData=");
        sb.append(this.f21410a);
        sb.append(", headerData=");
        sb.append(this.b);
        sb.append(", betProgress=");
        axq.r(this.c, this.d, ", paymentProgress=", ", autoSaleProgress=", sb);
        brm0.w(this.e, ", showOnlyFullSale=", ", showOnlyFullSaleWithAutoSale=", sb, this.f);
        ua80.u(", showPartialSale=", ", showAutoSale=", sb, this.g, this.h);
        ua80.u(", saleButtonVisible=", ", betCurrentValue=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", contentUiState=");
        sb.append(this.l);
        sb.append(", progress=");
        return rz4.j(this.m, Separators.RPAREN, sb);
    }
}
