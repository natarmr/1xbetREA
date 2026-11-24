package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m9q0 implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f21423a;
    public final s6q0 b;

    public m9q0(u0f0 u0f0Var, s6q0 s6q0Var) {
        this.f21423a = u0f0Var;
        this.b = s6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9q0)) {
            return false;
        }
        m9q0 m9q0Var = (m9q0) obj;
        return this.f21423a == m9q0Var.f21423a && this.b.equals(m9q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21423a.hashCode() * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return this.f21423a;
    }

    public final String toString() {
        return "TextPickerFieldUiModel(registrationFieldType=" + this.f21423a + ", textFieldFilledUiModel=" + this.b + Separators.RPAREN;
    }
}
