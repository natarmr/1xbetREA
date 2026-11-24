package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class muc0 implements nuc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final guc0 f22409a;
    public final hh80 b;

    public muc0(guc0 guc0Var, lh80 lh80Var) {
        guc0Var.getClass();
        this.f22409a = guc0Var;
        this.b = lh80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muc0)) {
            return false;
        }
        muc0 muc0Var = (muc0) obj;
        return this.f22409a == muc0Var.f22409a && Intrinsics.d(this.b, muc0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f22409a.hashCode() * 31;
        hh80 hh80Var = this.b;
        return iHashCode + (hh80Var == null ? 0 : hh80Var.hashCode());
    }

    public final String toString() {
        return "Shimmers(orientation=" + this.f22409a + ", contentPadding=" + this.b + Separators.RPAREN;
    }
}
