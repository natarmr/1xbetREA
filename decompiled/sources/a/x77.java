package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x77 implements z77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on5 f40401a;
    public final w2w b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList g;
    public final rv7 h;
    public final qgv0 i;
    public final boolean j;
    public final boolean k;

    public x77(on5 on5Var, w2w w2wVar, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, rv7 rv7Var, qgv0 qgv0Var, boolean z5, boolean z6) {
        this.f40401a = on5Var;
        this.b = w2wVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = arrayList;
        this.h = rv7Var;
        this.i = qgv0Var;
        this.j = z5;
        this.k = z6;
    }

    @Override // a.z77
    public final on5 b() {
        return this.f40401a;
    }

    @Override // a.z77
    public final boolean c() {
        return this.f;
    }

    @Override // a.z77
    public final boolean d() {
        return this.c;
    }

    @Override // a.z77
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x77)) {
            return false;
        }
        x77 x77Var = (x77) obj;
        return this.f40401a.equals(x77Var.f40401a) && this.b.equals(x77Var.b) && this.c == x77Var.c && this.d == x77Var.d && this.e == x77Var.e && this.f == x77Var.f && this.g.equals(x77Var.g) && this.h.equals(x77Var.h) && Intrinsics.d(this.i, x77Var.i) && this.j == x77Var.j && this.k == x77Var.k;
    }

    @Override // a.z77
    public final w2w f() {
        return this.b;
    }

    @Override // a.z77
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + twn.g(this.g, brm0.e(brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f40401a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31)) * 31;
        qgv0 qgv0Var = this.i;
        return Boolean.hashCode(this.k) + brm0.e(brm0.e((iHashCode + (qgv0Var == null ? 0 : qgv0Var.hashCode())) * 31, 31, this.j), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(balanceUiState=");
        sb.append(this.f40401a);
        sb.append(", historyHeaderUiModel=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=");
        ua80.u(", scrollToTop=", ", scrollToTopAnimated=", sb, this.c, this.d);
        ua80.u(", isFullScreenLoader=", ", historyUiModelList=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", betsSummaryInfoUiModelState=");
        sb.append(this.h);
        sb.append(", winBackBannerUiModel=");
        sb.append(this.i);
        sb.append(", isLoadingNextPage=");
        sb.append(this.j);
        sb.append(", isRefreshing=false, isLastPage=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
