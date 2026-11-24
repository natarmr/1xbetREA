package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r090 implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29621a;
    public final a4x b;
    public final boolean c;

    public r090(String str, i4 i4Var, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        i4Var.getClass();
        this.f29621a = str;
        this.b = i4Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r090)) {
            return false;
        }
        r090 r090Var = (r090) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f29621a, r090Var.f29621a) && Intrinsics.d(this.b, r090Var.b) && this.c == r090Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, ua80.b(u0f0.g1.hashCode() * 31, 31, this.f29621a), 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.g1;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.g1;
        StringBuilder sb = new StringBuilder("PasswordRequirementsBlockUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", title=");
        sb.append(this.f29621a);
        sb.append(", passwordRequirementList=");
        return rz4.m(sb, this.b, ", isExpanded=", this.c, Separators.RPAREN);
    }
}
