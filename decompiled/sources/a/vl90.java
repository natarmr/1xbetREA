package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vl90 implements x0f0, rqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final inm f37611a;
    public final j3x b;
    public final boolean c;

    public vl90(inm inmVar, j3x j3xVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f37611a = inmVar;
        this.b = j3xVar;
        this.c = z;
    }

    @Override // a.rqq
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl90)) {
            return false;
        }
        vl90 vl90Var = (vl90) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f37611a.equals(vl90Var.f37611a) && Intrinsics.d(this.b, vl90Var.b) && this.c == vl90Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.f37611a.hashCode() + (u0f0.h.hashCode() * 31)) * 31;
        j3x j3xVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.h;
    }

    public final String toString() {
        return "PhoneFieldUiModel(registrationFieldType=" + u0f0.h + ", dsPhoneTextFieldUiModel=" + this.f37611a + ", imeAction=" + this.b + ", isFocus=" + this.c + Separators.RPAREN;
    }
}
