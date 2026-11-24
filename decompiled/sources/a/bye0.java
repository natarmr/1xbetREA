package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bye0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f3413a;
    public final l7m0 b;
    public final l7m0 c;
    public final boolean d;

    public bye0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, boolean z) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        this.f3413a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bye0)) {
            return false;
        }
        bye0 bye0Var = (bye0) obj;
        return Intrinsics.d(this.f3413a, bye0Var.f3413a) && Intrinsics.d(this.b, bye0Var.b) && Intrinsics.d(this.c, bye0Var.c) && this.d == bye0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + h97.c(this.c, h97.c(this.b, this.f3413a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "RegistrationDefaultUiState(contentState=" + this.f3413a + ", navigationBarUiModel=" + this.b + ", registrationButton=" + this.c + ", isLoading=" + this.d + Separators.RPAREN;
    }
}
