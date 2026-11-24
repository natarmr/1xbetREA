package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qfc0 implements y0f0, sqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6q0 f28625a;
    public final boolean b;
    public final j3x c;
    public final boolean d;

    public qfc0(c6q0 c6q0Var, boolean z, j3x j3xVar, boolean z2) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f28625a = c6q0Var;
        this.b = z;
        this.c = j3xVar;
        this.d = z2;
    }

    @Override // a.sqq
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfc0)) {
            return false;
        }
        qfc0 qfc0Var = (qfc0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f28625a.equals(qfc0Var.f28625a) && this.b == qfc0Var.b && Intrinsics.d(this.c, qfc0Var.c) && this.d == qfc0Var.d;
    }

    public final int hashCode() {
        int iE = brm0.e((this.f28625a.hashCode() + (u0f0.u.hashCode() * 31)) * 31, 31, this.b);
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iE + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.u;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.u;
        StringBuilder sb = new StringBuilder("PromoCodeTextFieldUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", textFieldBasicUiModel=");
        sb.append(this.f28625a);
        sb.append(", isAllCaps=");
        sb.append(this.b);
        sb.append(", imeAction=");
        sb.append(this.c);
        sb.append(", isFocus=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
