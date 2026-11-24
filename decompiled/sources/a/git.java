package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class git {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11366a;
    public final boolean b;
    public final mdm c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final List k;
    public final a4x l;
    public final a4x m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final yo80 q;
    public final yo80 r;
    public final ait s;

    public git(boolean z, boolean z2, mdm mdmVar, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4, List list, a4x a4xVar, a4x a4xVar2, boolean z5, boolean z6, String str6, yo80 yo80Var, yo80 yo80Var2, ait aitVar) {
        mdmVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str6.getClass();
        yo80Var.getClass();
        yo80Var2.getClass();
        aitVar.getClass();
        this.f11366a = z;
        this.b = z2;
        this.c = mdmVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.j = z4;
        this.k = list;
        this.l = a4xVar;
        this.m = a4xVar2;
        this.n = z5;
        this.o = z6;
        this.p = str6;
        this.q = yo80Var;
        this.r = yo80Var2;
        this.s = aitVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof git)) {
            return false;
        }
        git gitVar = (git) obj;
        return this.f11366a == gitVar.f11366a && this.b == gitVar.b && Intrinsics.d(this.c, gitVar.c) && Intrinsics.d(this.d, gitVar.d) && Intrinsics.d(this.e, gitVar.e) && Intrinsics.d(this.f, gitVar.f) && Intrinsics.d(this.g, gitVar.g) && Intrinsics.d(this.h, gitVar.h) && this.i == gitVar.i && this.j == gitVar.j && Intrinsics.d(this.k, gitVar.k) && Intrinsics.d(this.l, gitVar.l) && Intrinsics.d(this.m, gitVar.m) && this.n == gitVar.n && this.o == gitVar.o && Intrinsics.d(this.p, gitVar.p) && Intrinsics.d(this.q, gitVar.q) && Intrinsics.d(this.r, gitVar.r) && Intrinsics.d(this.s, gitVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ua80.b(brm0.e(brm0.e(cs0.b(this.m, cs0.b(this.l, dw9.a(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(f140.d(this.c, brm0.e(Boolean.hashCode(this.f11366a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31, this.p)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GenerateCouponUiState(isLoading=", ", isError=", ", lottieConfigError=", this.f11366a, this.b);
        sbQ.append(this.c);
        sbQ.append(", betSum=");
        sbQ.append(this.d);
        sbQ.append(", wontedSum=");
        f140.v(sbQ, this.e, ", wontedSumText=", this.f, ", timeToStart=");
        f140.v(sbQ, this.g, ", typeOfCoupon=", this.h, ", generateCouponButtonIsEnabled=");
        ua80.u(", isLoadingAssemble=", ", couponTypeList=", sbQ, this.i, this.j);
        sbQ.append(this.k);
        sbQ.append(", sportTypeList=");
        sbQ.append(this.l);
        sbQ.append(", outcomesTypeList=");
        sbQ.append(this.m);
        sbQ.append(", typeCouponVisible=");
        sbQ.append(this.n);
        sbQ.append(", chipsCouponVisible=");
        f140.s(", timeToStartTitle=", this.p, ", betSumErrorState=", sbQ, this.o);
        sbQ.append(this.q);
        sbQ.append(", wontedSumErrorState=");
        sbQ.append(this.r);
        sbQ.append(", generateCouponStringResource=");
        sbQ.append(this.s);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
