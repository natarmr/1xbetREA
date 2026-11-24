package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbk0 f37657a;
    public final ok3 b;

    public vm3(hbk0 hbk0Var, ok3 ok3Var) {
        this.f37657a = hbk0Var;
        this.b = ok3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm3)) {
            return false;
        }
        vm3 vm3Var = (vm3) obj;
        return this.f37657a.equals(vm3Var.f37657a) && this.b.equals(vm3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37657a.hashCode() * 31);
    }

    public final String toString() {
        return "AppUpdateUiModel(background=" + this.f37657a + ", content=" + this.b + Separators.RPAREN;
    }
}
