package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l9q0 implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f19669a;
    public final c6q0 b;

    public l9q0(u0f0 u0f0Var, c6q0 c6q0Var) {
        this.f19669a = u0f0Var;
        this.b = c6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9q0)) {
            return false;
        }
        l9q0 l9q0Var = (l9q0) obj;
        return this.f19669a == l9q0Var.f19669a && this.b.equals(l9q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19669a.hashCode() * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return this.f19669a;
    }

    public final String toString() {
        return "TextPickerFieldUiModel(registrationFieldType=" + this.f19669a + ", textFieldBasicUiModel=" + this.b + Separators.RPAREN;
    }
}
