package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class emb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8039a;
    public final int b;
    public final ylb0 c;
    public final boolean d;
    public final String e;
    public final aoo0 f;
    public final a4x g;
    public final cmm h;
    public final g1b0 i;
    public final hdb0 j;
    public final skb0 k;

    public emb0(i4 i4Var, int i, ylb0 ylb0Var, boolean z, String str, aoo0 aoo0Var, i4 i4Var2, cmm cmmVar, g1b0 g1b0Var, hdb0 hdb0Var, skb0 skb0Var) {
        i4Var.getClass();
        str.getClass();
        aoo0Var.getClass();
        i4Var2.getClass();
        cmmVar.getClass();
        g1b0Var.getClass();
        this.f8039a = i4Var;
        this.b = i;
        this.c = ylb0Var;
        this.d = z;
        this.e = str;
        this.f = aoo0Var;
        this.g = i4Var2;
        this.h = cmmVar;
        this.i = g1b0Var;
        this.j = hdb0Var;
        this.k = skb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emb0)) {
            return false;
        }
        emb0 emb0Var = (emb0) obj;
        return Intrinsics.d(this.f8039a, emb0Var.f8039a) && this.b == emb0Var.b && this.c.equals(emb0Var.c) && this.d == emb0Var.d && Intrinsics.d(this.e, emb0Var.e) && this.f == emb0Var.f && Intrinsics.d(this.g, emb0Var.g) && Intrinsics.d(this.h, emb0Var.h) && Intrinsics.d(this.i, emb0Var.i) && Intrinsics.d(this.j, emb0Var.j) && this.k == emb0Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + cs0.b(this.g, (this.f.hashCode() + ua80.b(brm0.e((this.c.hashCode() + twn.a(this.b, this.f8039a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e)) * 31, 31)) * 31)) * 31;
        hdb0 hdb0Var = this.j;
        int iHashCode2 = (iHashCode + (hdb0Var == null ? 0 : hdb0Var.hashCode())) * 31;
        skb0 skb0Var = this.k;
        return iHashCode2 + (skb0Var != null ? skb0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PopularUiState(contentTypeList=" + this.f8039a + ", currentTabPos=" + this.b + ", currentTab=" + this.c + ", isSessionTimerVisible=" + this.d + ", sessionTimer=" + this.e + ", tabStyle=" + this.f + ", tabList=" + this.g + ", toolbarStyle=" + this.h + ", authModel=" + this.i + ", mainInfo=" + this.j + ", onboardingStep=" + this.k + Separators.RPAREN;
    }
}
