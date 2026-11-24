package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l090 implements y0f0, sqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f19188a;
    public final c6q0 b;
    public final j3x c;
    public final boolean d;

    public l090(u0f0 u0f0Var, c6q0 c6q0Var, j3x j3xVar, boolean z) {
        this.f19188a = u0f0Var;
        this.b = c6q0Var;
        this.c = j3xVar;
        this.d = z;
    }

    @Override // a.sqq
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l090)) {
            return false;
        }
        l090 l090Var = (l090) obj;
        return this.f19188a == l090Var.f19188a && this.b.equals(l090Var.b) && Intrinsics.d(this.c, l090Var.c) && this.d == l090Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f19188a.hashCode() * 31)) * 31;
        j3x j3xVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return this.f19188a;
    }

    public final String toString() {
        return "PasswordFieldUiModel(registrationFieldType=" + this.f19188a + ", textFieldBasicUiModel=" + this.b + ", imeAction=" + this.c + ", isFocus=" + this.d + Separators.RPAREN;
    }
}
