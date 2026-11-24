package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vi60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f37463a;
    public final a4x b;
    public final a4x c;
    public final a4x d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public vi60(d4d d4dVar, a4x a4xVar, a4x a4xVar2, a4x a4xVar3, int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f37463a = d4dVar;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = a4xVar3;
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi60)) {
            return false;
        }
        vi60 vi60Var = (vi60) obj;
        return this.f37463a == vi60Var.f37463a && Intrinsics.d(this.b, vi60Var.b) && Intrinsics.d(this.c, vi60Var.c) && Intrinsics.d(this.d, vi60Var.d) && this.e == vi60Var.e && Intrinsics.d(this.f, vi60Var.f) && Intrinsics.d(this.g, vi60Var.g) && Intrinsics.d(this.h, vi60Var.h) && this.i == vi60Var.i && this.j == vi60Var.j && this.k == vi60Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.e, cs0.b(this.d, cs0.b(this.c, cs0.b(this.b, this.f37463a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingBottomSheetUiState(bannerBackground=");
        sb.append(this.f37463a);
        sb.append(", images=");
        sb.append(this.b);
        sb.append(", titles=");
        hne.y(sb, this.c, ", descriptions=", this.d, ", initialPage=");
        kng0.w(this.e, ", nextButtonLabel=", this.f, ", acceptButtonLabel=", sb);
        f140.v(sb, this.g, ", skipButtonLabel=", this.h, ", visibleSkipButton=");
        ua80.u(", visibleBannerIndicator=", ", isSinglePage=", sb, this.i, this.j);
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
