package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7f0 f42244a;
    public final u0f0 b;
    public final a4x c;
    public final boolean d;

    public y9f0(q7f0 q7f0Var, u0f0 u0f0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f42244a = q7f0Var;
        this.b = u0f0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9f0)) {
            return false;
        }
        y9f0 y9f0Var = (y9f0) obj;
        return this.f42244a == y9f0Var.f42244a && this.b == y9f0Var.b && Intrinsics.d(this.c, y9f0Var.c) && this.d == y9f0Var.d;
    }

    public final int hashCode() {
        q7f0 q7f0Var = this.f42244a;
        int iHashCode = (q7f0Var == null ? 0 : q7f0Var.hashCode()) * 31;
        u0f0 u0f0Var = this.b;
        return Boolean.hashCode(this.d) + cs0.b(this.c, (iHashCode + (u0f0Var != null ? u0f0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationVisualContentUiModel(registrationType=");
        sb.append(this.f42244a);
        sb.append(", scrollToField=");
        sb.append(this.b);
        sb.append(", fieldsList=");
        return rz4.m(sb, this.c, ", isLoading=", this.d, Separators.RPAREN);
    }
}
