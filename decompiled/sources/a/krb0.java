package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class krb0 implements nrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrb0 f18756a;
    public final boolean b;

    public krb0(hrb0 hrb0Var, boolean z) {
        this.f18756a = hrb0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krb0)) {
            return false;
        }
        krb0 krb0Var = (krb0) obj;
        return this.f18756a.equals(krb0Var.f18756a) && this.b == krb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18756a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(powerbetUiModel=" + this.f18756a + ", needExit=" + this.b + Separators.RPAREN;
    }
}
