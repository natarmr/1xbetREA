package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ki5 implements mi5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2k0 f18320a;
    public final p2k0 b;

    public ki5(u2k0 u2k0Var, p2k0 p2k0Var) {
        this.f18320a = u2k0Var;
        this.b = p2k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki5)) {
            return false;
        }
        ki5 ki5Var = (ki5) obj;
        return this.f18320a.equals(ki5Var.f18320a) && Intrinsics.d(this.b, ki5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f18320a.hashCode() * 31;
        p2k0 p2k0Var = this.b;
        return iHashCode + (p2k0Var == null ? 0 : p2k0Var.hashCode());
    }

    public final String toString() {
        return "Content(topAppBarUiState=" + this.f18320a + ", mainBlockUiState=" + this.b + Separators.RPAREN;
    }
}
