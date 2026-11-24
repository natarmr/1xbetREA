package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zad implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final exo0 f44060a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final e4f h;
    public final String i;
    public final int j;
    public final String k;
    public final so7 l;
    public final mb90 m;
    public final boolean n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final String s;
    public final yad t;

    public zad(exo0 exo0Var, boolean z, String str, int i, String str2, boolean z2, boolean z3, e4f e4fVar, String str3, int i2, String str4, so7 so7Var, mb90 mb90Var, boolean z4, String str5, String str6, String str7, boolean z5, String str8, yad yadVar) {
        cs0.x(str3, str4, str7, str8);
        this.f44060a = exo0Var;
        this.b = z;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = e4fVar;
        this.i = str3;
        this.j = i2;
        this.k = str4;
        this.l = so7Var;
        this.m = mb90Var;
        this.n = z4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = z5;
        this.s = str8;
        this.t = yadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        zad zadVar = (zad) obj;
        return this.f44060a.equals(zadVar.f44060a) && this.b == zadVar.b && this.c.equals(zadVar.c) && this.d == zadVar.d && this.e.equals(zadVar.e) && this.f == zadVar.f && this.g == zadVar.g && this.h == zadVar.h && Intrinsics.d(this.i, zadVar.i) && this.j == zadVar.j && Intrinsics.d(this.k, zadVar.k) && this.l.equals(zadVar.l) && this.m.equals(zadVar.m) && this.n == zadVar.n && this.o.equals(zadVar.o) && this.p.equals(zadVar.p) && Intrinsics.d(this.q, zadVar.q) && this.r == zadVar.r && Intrinsics.d(this.s, zadVar.s) && this.t.equals(zadVar.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(brm0.e((this.m.hashCode() + ((this.l.hashCode() + ua80.b(twn.a(this.j, ua80.b((this.h.hashCode() + brm0.e(brm0.e(ua80.b(twn.a(this.d, ua80.b(brm0.e(this.f44060a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31), 31, this.k)) * 31)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompactHistoryItemUiModel(taxUiModel=");
        sb.append(this.f44060a);
        sb.append(", saleGroupVisible=");
        sb.append(this.b);
        sb.append(", betSaleValue=");
        twn.w(this.d, this.c, ", typeColor=", ", typeText=", sb);
        brm0.C(this.e, ", taxSectionVisible=", ", betCoeffTypeVisible=", sb, this.f);
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(", betStatusText=");
        twn.w(this.j, this.i, ", imageBetStatus=", ", betId=", sb);
        sb.append(this.k);
        sb.append(", betWinUiModel=");
        sb.append(this.l);
        sb.append(", payoutUiModel=");
        sb.append(this.m);
        sb.append(", betValueGroupVisible=");
        sb.append(this.n);
        sb.append(", betValueTitle=");
        f140.v(sb, this.o, ", betValue=", this.p, ", betCoefTitle=");
        brm0.C(this.q, ", betCoefVisible=", ", betCoef=", sb, this.r);
        sb.append(this.s);
        sb.append(", compactHeaderUiModel=");
        sb.append(this.t);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
