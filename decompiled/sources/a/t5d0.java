package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33364a;
    public final q5d0 b;

    public t5d0(i4 i4Var, q5d0 q5d0Var) {
        i4Var.getClass();
        this.f33364a = i4Var;
        this.b = q5d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5d0)) {
            return false;
        }
        t5d0 t5d0Var = (t5d0) obj;
        return Intrinsics.d(this.f33364a, t5d0Var.f33364a) && this.b == t5d0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33364a.hashCode() * 31);
    }

    public final String toString() {
        return "ProvidersCellsUiModel(providers=" + this.f33364a + ", style=" + this.b + Separators.RPAREN;
    }
}
