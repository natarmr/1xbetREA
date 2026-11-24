package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38471a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final dx e;
    public final w2q f;
    public final ga50 g;
    public final llm h;
    public final gmm i;
    public final tlm j;
    public final String k;
    public final boolean l;
    public final int m;
    public final a4x n;

    public w2w(String str, boolean z, boolean z2, String str2, dx dxVar, w2q w2qVar, ga50 ga50Var, llm llmVar, gmm gmmVar, tlm tlmVar, String str3, boolean z3, int i, a4x a4xVar) {
        w6x.x(a4xVar, str, str3);
        this.f38471a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = dxVar;
        this.f = w2qVar;
        this.g = ga50Var;
        this.h = llmVar;
        this.i = gmmVar;
        this.j = tlmVar;
        this.k = str3;
        this.l = z3;
        this.m = i;
        this.n = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2w)) {
            return false;
        }
        w2w w2wVar = (w2w) obj;
        return Intrinsics.d(this.f38471a, w2wVar.f38471a) && this.b == w2wVar.b && this.c == w2wVar.c && this.d.equals(w2wVar.d) && this.e.equals(w2wVar.e) && this.f.equals(w2wVar.f) && this.g.equals(w2wVar.g) && this.h.equals(w2wVar.h) && this.i.equals(w2wVar.i) && this.j.equals(w2wVar.j) && Intrinsics.d(this.k, w2wVar.k) && this.l == w2wVar.l && this.m == w2wVar.m && Intrinsics.d(this.n, w2wVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + twn.a(this.m, brm0.e(ua80.b((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b(brm0.e(brm0.e(this.f38471a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("HistoryHeaderUiModel(historyTitle=", this.f38471a, ", isAdditionalInfoShimmer=", this.b, ", expandableState=");
        f140.s(", balanceTitle=", this.d, ", additionalButtonsUiModel=", sbU, this.c);
        sbU.append(this.e);
        sbU.append(", filterButtonUiModel=");
        sbU.append(this.f);
        sbU.append(", arrowNavBarMiddleOptions=");
        sbU.append(this.g);
        sbU.append(", arrowBackNavigationBarLeftStyle=");
        sbU.append(this.h);
        sbU.append(", navigationBarRightStyle=");
        sbU.append(this.i);
        sbU.append(", middleNavBarStyle=");
        sbU.append(this.j);
        sbU.append(", typeSubtitle=");
        brm0.C(this.k, ", chevronIsVisible=", ", selectedTab=", sbU, this.l);
        sbU.append(this.m);
        sbU.append(", historyTypeTabList=");
        sbU.append(this.n);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
