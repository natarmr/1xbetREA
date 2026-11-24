package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o02 implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f24400a;
    public final rqm b;

    public o02(u0f0 u0f0Var, rqm rqmVar) {
        this.f24400a = u0f0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o02)) {
            return false;
        }
        o02 o02Var = (o02) obj;
        return this.f24400a == o02Var.f24400a && this.b.equals(o02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24400a.hashCode() * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return this.f24400a;
    }

    public final String toString() {
        return "AgreementFieldUiModel(registrationFieldType=" + this.f24400a + ", cellStyle=" + this.b + Separators.RPAREN;
    }
}
