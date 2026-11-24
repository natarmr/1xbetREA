package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q090 implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27886a;
    public final a4x b;
    public final boolean c;

    public q090(String str, i4 i4Var, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        i4Var.getClass();
        this.f27886a = str;
        this.b = i4Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q090)) {
            return false;
        }
        q090 q090Var = (q090) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f27886a, q090Var.f27886a) && Intrinsics.d(this.b, q090Var.b) && this.c == q090Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, ua80.b(u0f0.g1.hashCode() * 31, 31, this.f27886a), 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.g1;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.g1;
        StringBuilder sb = new StringBuilder("PasswordRequirementsBlockUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", title=");
        sb.append(this.f27886a);
        sb.append(", passwordRequirementList=");
        return rz4.m(sb, this.b, ", isExpanded=", this.c, Separators.RPAREN);
    }
}
