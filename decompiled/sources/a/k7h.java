package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f17819a;
    public final a4x b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final vbg i;

    public k7h(a4x a4xVar, a4x a4xVar2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, vbg vbgVar) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f17819a = a4xVar;
        this.b = a4xVar2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = vbgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7h)) {
            return false;
        }
        k7h k7hVar = (k7h) obj;
        return Intrinsics.d(this.f17819a, k7hVar.f17819a) && Intrinsics.d(this.b, k7hVar.b) && this.c == k7hVar.c && this.d == k7hVar.d && this.e == k7hVar.e && this.f == k7hVar.f && this.g == k7hVar.g && this.h == k7hVar.h && Intrinsics.d(this.i, k7hVar.i);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(cs0.b(this.b, this.f17819a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        vbg vbgVar = this.i;
        return iE + (vbgVar == null ? 0 : vbgVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("CyberMarketsUiState(subGames=", this.f17819a, ", categories=", this.b, ", selectedSubGameId=");
        sbQ.append(this.c);
        kng0.A(sbQ, ", selectedCategoryId=", this.d, ", categoriesVisible=");
        ua80.u(", subGamesVisible=", ", subGamesFilterVisible=", sbQ, this.e, this.f);
        ua80.u(", isLoading=", ", categoryMarkets=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
