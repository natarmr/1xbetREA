package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pfc0 implements x0f0, rqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6q0 f26896a;
    public final boolean b;
    public final j3x c;
    public final boolean d;

    public pfc0(s6q0 s6q0Var, boolean z, j3x j3xVar, boolean z2) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f26896a = s6q0Var;
        this.b = z;
        this.c = j3xVar;
        this.d = z2;
    }

    @Override // a.rqq
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfc0)) {
            return false;
        }
        pfc0 pfc0Var = (pfc0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f26896a.equals(pfc0Var.f26896a) && this.b == pfc0Var.b && Intrinsics.d(this.c, pfc0Var.c) && this.d == pfc0Var.d;
    }

    public final int hashCode() {
        int iE = brm0.e((this.f26896a.hashCode() + (u0f0.u.hashCode() * 31)) * 31, 31, this.b);
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iE + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.u;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.u;
        StringBuilder sb = new StringBuilder("PromoCodeTextFieldUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", textFieldFilledUiModel=");
        sb.append(this.f26896a);
        sb.append(", isAllCaps=");
        sb.append(this.b);
        sb.append(", imeAction=");
        sb.append(this.c);
        sb.append(", isFocus=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
