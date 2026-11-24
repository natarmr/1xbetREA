package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yl90 implements z0f0, tqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final inm f42830a;
    public final j3x b;
    public final boolean c;

    public yl90(inm inmVar, j3x j3xVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f42830a = inmVar;
        this.b = j3xVar;
        this.c = z;
    }

    @Override // a.tqq
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl90)) {
            return false;
        }
        yl90 yl90Var = (yl90) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f42830a.equals(yl90Var.f42830a) && Intrinsics.d(this.b, yl90Var.b) && this.c == yl90Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.f42830a.hashCode() + (u0f0.h.hashCode() * 31)) * 31;
        j3x j3xVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.h;
    }

    public final String toString() {
        return "PhoneFieldUiModel(registrationFieldType=" + u0f0.h + ", dsPhoneTextFieldUiModel=" + this.f42830a + ", imeAction=" + this.b + ", isFocus=" + this.c + Separators.RPAREN;
    }
}
