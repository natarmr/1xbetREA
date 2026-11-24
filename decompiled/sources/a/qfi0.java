package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qfi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f28636a;
    public final int b;

    public qfi0(swp0 swp0Var, int i) {
        this.f28636a = swp0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfi0)) {
            return false;
        }
        qfi0 qfi0Var = (qfi0) obj;
        return this.f28636a.equals(qfi0Var.f28636a) && this.b == qfi0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f28636a.hashCode() * 31);
    }

    public final String toString() {
        return "SentSmsCodeModel(temporaryToken=" + this.f28636a + ", time=" + this.b + Separators.RPAREN;
    }
}
