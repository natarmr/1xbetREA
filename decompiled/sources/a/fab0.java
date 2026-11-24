package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9201a;
    public final jx00 b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final uql0 k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final ArrayList o;

    public fab0(ArrayList arrayList, jx00 jx00Var, int i, boolean z, String str, String str2, String str3, boolean z2, String str4, String str5, uql0 uql0Var, boolean z3, boolean z4, String str6, ArrayList arrayList2) {
        str3.getClass();
        this.f9201a = arrayList;
        this.b = jx00Var;
        this.c = i;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = str4;
        this.j = str5;
        this.k = uql0Var;
        this.l = z3;
        this.m = z4;
        this.n = str6;
        this.o = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fab0)) {
            return false;
        }
        fab0 fab0Var = (fab0) obj;
        return this.f9201a.equals(fab0Var.f9201a) && this.b.equals(fab0Var.b) && this.c == fab0Var.c && this.d == fab0Var.d && this.e.equals(fab0Var.e) && this.f.equals(fab0Var.f) && Intrinsics.d(this.g, fab0Var.g) && this.h == fab0Var.h && this.i.equals(fab0Var.i) && this.j.equals(fab0Var.j) && this.k == fab0Var.k && this.l == fab0Var.l && this.m == fab0Var.m && this.n.equals(fab0Var.n) && this.o.equals(fab0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ua80.b(brm0.e(brm0.e((this.k.hashCode() + ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(brm0.e(twn.a(this.c, (this.b.hashCode() + (this.f9201a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularClassicUiModel(tabUiModelList=");
        sb.append(this.f9201a);
        sb.append(", logoUiModel=");
        sb.append(this.b);
        sb.append(", selectedTabPosition=");
        brm0.w(this.c, ", showSearchButton=", ", currentBalance=", sb, this.d);
        f140.v(sb, this.e, ", currencySymbol=", this.f, ", replenishPlaceHolder=");
        brm0.C(this.g, ", showAuthButtons=", ", accountControlStyle=", sb, this.h);
        f140.v(sb, this.i, ", popularToolbarStyle=", this.j, ", sportsCollectionType=");
        sb.append(this.k);
        sb.append(", showBalance=");
        sb.append(this.l);
        sb.append(", showSessionTimer=");
        f140.s(", tabStyle=", this.n, ", tabDSModelsList=", sb, this.m);
        return rz4.n(sb, this.o, Separators.RPAREN);
    }
}
