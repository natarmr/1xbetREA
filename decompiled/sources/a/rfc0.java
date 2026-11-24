package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rfc0 implements z0f0, tqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6q0 f30381a;
    public final boolean b;
    public final j3x c;
    public final boolean d;

    public rfc0(s6q0 s6q0Var, boolean z, j3x j3xVar, boolean z2) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f30381a = s6q0Var;
        this.b = z;
        this.c = j3xVar;
        this.d = z2;
    }

    @Override // a.tqq
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfc0)) {
            return false;
        }
        rfc0 rfc0Var = (rfc0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f30381a.equals(rfc0Var.f30381a) && this.b == rfc0Var.b && Intrinsics.d(this.c, rfc0Var.c) && this.d == rfc0Var.d;
    }

    public final int hashCode() {
        int iE = brm0.e((this.f30381a.hashCode() + (u0f0.u.hashCode() * 31)) * 31, 31, this.b);
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iE + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.u;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.u;
        StringBuilder sb = new StringBuilder("PromoCodeTextFieldUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", textFieldFilledUiModel=");
        sb.append(this.f30381a);
        sb.append(", isAllCaps=");
        sb.append(this.b);
        sb.append(", imeAction=");
        sb.append(this.c);
        sb.append(", isFocus=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
