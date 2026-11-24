package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21469a;
    public final lao0 b;

    public mao0(boolean z, lao0 lao0Var) {
        this.f21469a = z;
        this.b = lao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mao0)) {
            return false;
        }
        mao0 mao0Var = (mao0) obj;
        return this.f21469a == mao0Var.f21469a && this.b.equals(mao0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f21469a) * 31);
    }

    public final String toString() {
        return "TabBarState(tabBarVisible=" + this.f21469a + ", tabBarDSModel=" + this.b + Separators.RPAREN;
    }
}
