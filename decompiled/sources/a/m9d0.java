package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21405a;
    public final r080 b;

    public m9d0(String str, r080 r080Var) {
        this.f21405a = str;
        this.b = r080Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d0)) {
            return false;
        }
        m9d0 m9d0Var = (m9d0) obj;
        return this.f21405a.equals(m9d0Var.f21405a) && this.b == m9d0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21405a.hashCode() * 31);
    }

    public final String toString() {
        return "Authenticator(operationGuid=" + this.f21405a + ", operationConfirmation=" + this.b + Separators.RPAREN;
    }
}
