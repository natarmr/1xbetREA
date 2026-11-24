package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yqd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43071a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final a4x h;
    public final zdm0 i;
    public final nc5 j;
    public final boolean k;

    public yqd0(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, a4x a4xVar, zdm0 zdm0Var, nc5 nc5Var, boolean z4) {
        a4xVar.getClass();
        this.f43071a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = a4xVar;
        this.i = zdm0Var;
        this.j = nc5Var;
        this.k = z4;
    }

    public static yqd0 a(yqd0 yqd0Var, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, a4x a4xVar, zdm0 zdm0Var, nc5 nc5Var, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = yqd0Var.f43071a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = yqd0Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = yqd0Var.c;
        }
        boolean z7 = z3;
        String str5 = (i & 8) != 0 ? yqd0Var.d : str;
        String str6 = (i & 16) != 0 ? yqd0Var.e : str2;
        String str7 = (i & 32) != 0 ? yqd0Var.f : str3;
        String str8 = (i & 64) != 0 ? yqd0Var.g : str4;
        a4x a4xVar2 = (i & 128) != 0 ? yqd0Var.h : a4xVar;
        zdm0 zdm0Var2 = (i & 256) != 0 ? yqd0Var.i : zdm0Var;
        nc5 nc5Var2 = (i & 512) != 0 ? yqd0Var.j : nc5Var;
        boolean z8 = (i & 1024) != 0 ? yqd0Var.k : z4;
        yqd0Var.getClass();
        str5.getClass();
        str8.getClass();
        a4xVar2.getClass();
        return new yqd0(z5, z6, z7, str5, str6, str7, str8, a4xVar2, zdm0Var2, nc5Var2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqd0)) {
            return false;
        }
        yqd0 yqd0Var = (yqd0) obj;
        return this.f43071a == yqd0Var.f43071a && this.b == yqd0Var.b && this.c == yqd0Var.c && this.d.equals(yqd0Var.d) && this.e.equals(yqd0Var.e) && this.f.equals(yqd0Var.f) && this.g.equals(yqd0Var.g) && Intrinsics.d(this.h, yqd0Var.h) && this.i.equals(yqd0Var.i) && this.j.equals(yqd0Var.j) && this.k == yqd0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + kng0.a(this.i, cs0.b(this.h, ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f43071a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RaceMenuState(isLoading=", ", isError=", ", isEmpty=", this.f43071a, this.b);
        f140.s(", trackId=", this.d, ", title=", sbQ, this.c);
        f140.v(sbQ, this.e, ", subtitle=", this.f, ", date=");
        cs0.B(sbQ, this.g, ", menuItemList=", this.h, ", statisticHeaderUiModel=");
        sbQ.append(this.i);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.j);
        sbQ.append(", isLive=");
        return rw2.p(sbQ, this.k, Separators.RPAREN);
    }
}
