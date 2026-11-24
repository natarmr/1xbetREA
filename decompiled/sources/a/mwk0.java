package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mwk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22508a;
    public final a4x b;
    public final dxh0 c;

    public mwk0(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f22508a = i;
        this.b = a4xVar;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwk0)) {
            return false;
        }
        mwk0 mwk0Var = (mwk0) obj;
        return this.f22508a == mwk0Var.f22508a && Intrinsics.d(this.b, mwk0Var.b) && this.c.equals(mwk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, Integer.hashCode(this.f22508a) * 31, 31);
    }

    public final String toString() {
        return "SpecialEventTabsUiModel(selectedTab=" + this.f22508a + ", segments=" + this.b + ", segmentedControlStyle=" + this.c + Separators.RPAREN;
    }
}
