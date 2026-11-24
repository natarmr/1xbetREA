package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qf50 implements sf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28614a;
    public final boolean b;

    public qf50(boolean z, boolean z2) {
        this.f28614a = z;
        this.b = z2;
    }

    public static qf50 a(qf50 qf50Var, int i) {
        return new qf50((i & 1) != 0 ? qf50Var.f28614a : false, (i & 2) != 0 ? qf50Var.b : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf50)) {
            return false;
        }
        qf50 qf50Var = (qf50) obj;
        return this.f28614a == qf50Var.f28614a && this.b == qf50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f28614a) * 31);
    }

    public final String toString() {
        return hne.n("OpenCompleteProfileScreen(isNeedOpenVerification=", ", isNeedOpenBindPhone=", Separators.RPAREN, this.f28614a, this.b);
    }
}
