package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hqw implements lqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f13504a;
    public final zdm0 b;
    public final j9m0 c;
    public final boolean d;

    public hqw(a4x a4xVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        a4xVar.getClass();
        this.f13504a = a4xVar;
        this.b = zdm0Var;
        this.c = j9m0Var;
        this.d = z;
    }

    @Override // a.lqw
    public final boolean a() {
        return this.d;
    }

    @Override // a.lqw
    public final j9m0 b() {
        return this.c;
    }

    @Override // a.lqw
    public final zdm0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqw)) {
            return false;
        }
        hqw hqwVar = (hqw) obj;
        return Intrinsics.d(this.f13504a, hqwVar.f13504a) && this.b.equals(hqwVar.b) && this.c.equals(hqwVar.c) && this.d == hqwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w6x.h(this.c, kng0.a(this.b, this.f13504a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Content(menuItemList=" + this.f13504a + ", statisticHeaderUiModel=" + this.b + ", statisticBackgroundUiModel=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
