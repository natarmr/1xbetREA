package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mrb0 implements nrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrb0 f22262a;

    public mrb0(hrb0 hrb0Var) {
        this.f22262a = hrb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrb0) && this.f22262a.equals(((mrb0) obj).f22262a);
    }

    public final int hashCode() {
        return this.f22262a.hashCode();
    }

    public final String toString() {
        return "Success(powerbetUiModel=" + this.f22262a + Separators.RPAREN;
    }
}
