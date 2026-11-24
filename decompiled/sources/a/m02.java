package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m02 implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f20933a;
    public final rqm b;

    public m02(u0f0 u0f0Var, rqm rqmVar) {
        this.f20933a = u0f0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m02)) {
            return false;
        }
        m02 m02Var = (m02) obj;
        return this.f20933a == m02Var.f20933a && this.b.equals(m02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20933a.hashCode() * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return this.f20933a;
    }

    public final String toString() {
        return "AgreementFieldUiModel(registrationFieldType=" + this.f20933a + ", cellStyle=" + this.b + Separators.RPAREN;
    }
}
