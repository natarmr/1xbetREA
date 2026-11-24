package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ll7 implements pl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20233a;
    public final on5 b;
    public final boolean c;
    public final ArrayList d;
    public final boolean e;
    public final boolean f;

    public ll7(String str, on5 on5Var, boolean z, ArrayList arrayList, boolean z2, boolean z3) {
        str.getClass();
        this.f20233a = str;
        this.b = on5Var;
        this.c = z;
        this.d = arrayList;
        this.e = z2;
        this.f = z3;
    }

    @Override // a.pl7
    public final on5 b() {
        return this.b;
    }

    @Override // a.pl7
    public final boolean c() {
        return this.e;
    }

    @Override // a.pl7
    public final boolean d() {
        return this.c;
    }

    @Override // a.pl7
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll7)) {
            return false;
        }
        ll7 ll7Var = (ll7) obj;
        return Intrinsics.d(this.f20233a, ll7Var.f20233a) && this.b.equals(ll7Var.b) && this.c == ll7Var.c && this.d.equals(ll7Var.d) && this.e == ll7Var.e && this.f == ll7Var.f;
    }

    @Override // a.pl7
    public final String getTitle() {
        return this.f20233a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(twn.g(this.d, brm0.e(brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f20233a.hashCode() * 31)) * 31, 31, this.c), 31, false), 31, false), 31, false), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(title=");
        sb.append(this.f20233a);
        sb.append(", balanceUiState=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=");
        sb.append(this.c);
        sb.append(", isLoadingNextPage=false, isRefreshing=false, isLastPage=false, historyUiModelList=");
        sb.append(this.d);
        sb.append(", isFullScreenLoader=");
        return ohs0.p(", scrollToTop=", Separators.RPAREN, sb, this.e, this.f);
    }
}
