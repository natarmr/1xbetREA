package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class chg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1w0 f4359a;
    public final ihg0 b;

    public chg0(ihg0 ihg0Var, i1w0 i1w0Var) {
        i1w0Var.getClass();
        this.f4359a = i1w0Var;
        this.b = ihg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chg0)) {
            return false;
        }
        chg0 chg0Var = (chg0) obj;
        return Intrinsics.d(this.f4359a, chg0Var.f4359a) && Intrinsics.d(this.b, chg0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4359a.hashCode() * 31;
        ihg0 ihg0Var = this.b;
        return iHashCode + (ihg0Var == null ? 0 : ihg0Var.hashCode());
    }

    public final String toString() {
        return "RouterEntry(router=" + this.f4359a + ", parentRouterKey=" + this.b + Separators.RPAREN;
    }
}
