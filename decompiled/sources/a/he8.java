package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class he8 implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6q0 f12909a;

    public he8(c6q0 c6q0Var) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f12909a = c6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he8)) {
            return false;
        }
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f12909a.equals(((he8) obj).f12909a);
    }

    public final int hashCode() {
        return this.f12909a.hashCode() + (u0f0.v.hashCode() * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.v;
    }

    public final String toString() {
        return "BonusFieldUiModel(registrationFieldType=" + u0f0.v + ", textFieldBasicUiModel=" + this.f12909a + Separators.RPAREN;
    }
}
