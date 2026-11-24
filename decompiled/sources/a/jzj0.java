package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jzj0 implements z0f0, tqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f17416a;
    public final s6q0 b;
    public final j3x c;
    public final boolean d;

    public jzj0(u0f0 u0f0Var, s6q0 s6q0Var, j3x j3xVar, boolean z) {
        this.f17416a = u0f0Var;
        this.b = s6q0Var;
        this.c = j3xVar;
        this.d = z;
    }

    @Override // a.tqq
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzj0)) {
            return false;
        }
        jzj0 jzj0Var = (jzj0) obj;
        return this.f17416a == jzj0Var.f17416a && this.b.equals(jzj0Var.b) && Intrinsics.d(this.c, jzj0Var.c) && this.d == jzj0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f17416a.hashCode() * 31)) * 31;
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return this.f17416a;
    }

    public final String toString() {
        return "SimpleTextFieldUiModel(registrationFieldType=" + this.f17416a + ", textFieldFilledUiModel=" + this.b + ", imeAction=" + this.c + ", isFocus=" + this.d + Separators.RPAREN;
    }
}
