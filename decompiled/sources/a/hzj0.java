package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hzj0 implements x0f0, rqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f13910a;
    public final s6q0 b;
    public final j3x c;
    public final boolean d;

    public hzj0(u0f0 u0f0Var, s6q0 s6q0Var, j3x j3xVar, boolean z) {
        this.f13910a = u0f0Var;
        this.b = s6q0Var;
        this.c = j3xVar;
        this.d = z;
    }

    @Override // a.rqq
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzj0)) {
            return false;
        }
        hzj0 hzj0Var = (hzj0) obj;
        return this.f13910a == hzj0Var.f13910a && this.b.equals(hzj0Var.b) && Intrinsics.d(this.c, hzj0Var.c) && this.d == hzj0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13910a.hashCode() * 31)) * 31;
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return this.f13910a;
    }

    public final String toString() {
        return "SimpleTextFieldUiModel(registrationFieldType=" + this.f13910a + ", textFieldFilledUiModel=" + this.b + ", imeAction=" + this.c + ", isFocus=" + this.d + Separators.RPAREN;
    }
}
