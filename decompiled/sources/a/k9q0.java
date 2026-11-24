package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k9q0 implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f17928a;
    public final s6q0 b;

    public k9q0(u0f0 u0f0Var, s6q0 s6q0Var) {
        this.f17928a = u0f0Var;
        this.b = s6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9q0)) {
            return false;
        }
        k9q0 k9q0Var = (k9q0) obj;
        return this.f17928a == k9q0Var.f17928a && this.b.equals(k9q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17928a.hashCode() * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return this.f17928a;
    }

    public final String toString() {
        return "TextPickerFieldUiModel(registrationFieldType=" + this.f17928a + ", textFieldFilledUiModel=" + this.b + Separators.RPAREN;
    }
}
