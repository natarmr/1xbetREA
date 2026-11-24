package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f23236a;
    public final l7m0 b;
    public final l7m0 c;
    public final boolean d;

    public nbf0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, boolean z) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        this.f23236a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbf0)) {
            return false;
        }
        nbf0 nbf0Var = (nbf0) obj;
        return Intrinsics.d(this.f23236a, nbf0Var.f23236a) && Intrinsics.d(this.b, nbf0Var.b) && Intrinsics.d(this.c, nbf0Var.c) && this.d == nbf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + h97.c(this.c, h97.c(this.b, this.f23236a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "RegistrationVisualUiState(appBarState=" + this.f23236a + ", contentState=" + this.b + ", bottomBarState=" + this.c + ", isLoading=" + this.d + Separators.RPAREN;
    }
}
