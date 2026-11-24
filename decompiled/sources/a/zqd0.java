package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zqd0 implements drd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f44803a;
    public final j9m0 b;
    public final boolean c;
    public final a4x d;

    public zqd0(a4x a4xVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        a4xVar.getClass();
        this.f44803a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
        this.d = a4xVar;
    }

    @Override // a.drd0
    public final boolean a() {
        return this.c;
    }

    @Override // a.drd0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.drd0
    public final zdm0 c() {
        return this.f44803a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqd0)) {
            return false;
        }
        zqd0 zqd0Var = (zqd0) obj;
        return this.f44803a.equals(zqd0Var.f44803a) && this.b.equals(zqd0Var.b) && this.c == zqd0Var.c && Intrinsics.d(this.d, zqd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(w6x.h(this.b, this.f44803a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Content(statisticHeaderUiModel=" + this.f44803a + ", statisticBackgroundUiModel=" + this.b + ", rtlSupport=" + this.c + ", menuItemList=" + this.d + Separators.RPAREN;
    }
}
