package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d8f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7f0 f5645a;
    public final gy30 b;

    public d8f0(q7f0 q7f0Var, gy30 gy30Var) {
        q7f0Var.getClass();
        this.f5645a = q7f0Var;
        this.b = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8f0)) {
            return false;
        }
        d8f0 d8f0Var = (d8f0) obj;
        return this.f5645a == d8f0Var.f5645a && this.b.equals(d8f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5645a.hashCode() * 31);
    }

    public final String toString() {
        return "RegistrationTypeSelectionItemUiModel(registrationType=" + this.f5645a + ", menuCellStyle=" + this.b + Separators.RPAREN;
    }
}
