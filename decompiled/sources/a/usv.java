package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class usv implements ysv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8l0 f36229a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;
    public final a4x g;
    public final boolean h;
    public final a4x i;
    public final int j;
    public final boolean k;

    public usv(h8l0 h8l0Var, boolean z, String str, String str2, String str3, a4x a4xVar, i4 i4Var, boolean z2, a4x a4xVar2, int i, boolean z3) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        i4Var.getClass();
        a4xVar2.getClass();
        this.f36229a = h8l0Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = a4xVar;
        this.g = i4Var;
        this.h = z2;
        this.i = a4xVar2;
        this.j = i;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usv)) {
            return false;
        }
        usv usvVar = (usv) obj;
        return this.f36229a == usvVar.f36229a && this.b == usvVar.b && Intrinsics.d(this.c, usvVar.c) && Intrinsics.d(this.d, usvVar.d) && this.e.equals(usvVar.e) && Intrinsics.d(this.f, usvVar.f) && Intrinsics.d(this.g, usvVar.g) && this.h == usvVar.h && Intrinsics.d(this.i, usvVar.i) && this.j == usvVar.j && this.k == usvVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + twn.a(this.j, cs0.b(this.i, brm0.e(cs0.b(this.g, cs0.b(this.f, ua80.b(ua80.b(ua80.b(brm0.e(this.f36229a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(style=");
        sb.append(this.f36229a);
        sb.append(", navigationBarSearchViewExpanded=");
        sb.append(this.b);
        sb.append(", navigationBarTitle=");
        f140.v(sb, this.c, ", navigationBarSearchHint=", this.d, ", navigationBarSearchQuery=");
        cs0.B(sb, this.e, ", navigationButtons=", this.f, ", availableTabs=");
        sb.append(this.g);
        sb.append(", showSeparator=");
        sb.append(this.h);
        sb.append(", countriesList=");
        sb.append(this.i);
        sb.append(", currentTab=");
        sb.append(this.j);
        sb.append(", enableSearchAutoFocus=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
