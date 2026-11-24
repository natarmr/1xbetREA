package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m090 implements z0f0, tqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f20943a;
    public final s6q0 b;
    public final j3x c;
    public final boolean d;

    public m090(u0f0 u0f0Var, s6q0 s6q0Var, j3x j3xVar, boolean z) {
        this.f20943a = u0f0Var;
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
        if (!(obj instanceof m090)) {
            return false;
        }
        m090 m090Var = (m090) obj;
        return this.f20943a == m090Var.f20943a && this.b.equals(m090Var.b) && Intrinsics.d(this.c, m090Var.c) && this.d == m090Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f20943a.hashCode() * 31)) * 31;
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return this.f20943a;
    }

    public final String toString() {
        return "PasswordFieldUiModel(registrationFieldType=" + this.f20943a + ", textFieldFilledUiModel=" + this.b + ", imeAction=" + this.c + ", isFocus=" + this.d + Separators.RPAREN;
    }
}
