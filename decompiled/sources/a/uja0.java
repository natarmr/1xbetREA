package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uja0 implements vja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f35769a;
    public final hca0 b;
    public final a4x c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public uja0(j9m0 j9m0Var, hca0 hca0Var, a4x a4xVar, int i, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f35769a = j9m0Var;
        this.b = hca0Var;
        this.c = a4xVar;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    @Override // a.vja0
    public final j9m0 d() {
        return this.f35769a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uja0)) {
            return false;
        }
        uja0 uja0Var = (uja0) obj;
        return this.f35769a.equals(uja0Var.f35769a) && this.b.equals(uja0Var.b) && Intrinsics.d(this.c, uja0Var.c) && this.d == uja0Var.d && this.e == uja0Var.e && this.f == uja0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(twn.a(this.d, cs0.b(this.c, (this.b.hashCode() + (this.f35769a.hashCode() * 31)) * 31, 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(backgroundUiModel=");
        sb.append(this.f35769a);
        sb.append(", playerTennisMenuUiModel=");
        sb.append(this.b);
        sb.append(", tabList=");
        sb.append(this.c);
        sb.append(", currentTabPosition=");
        sb.append(this.d);
        sb.append(", isPair=");
        return ohs0.p(", isNightTheme=", Separators.RPAREN, sb, this.e, this.f);
    }
}
