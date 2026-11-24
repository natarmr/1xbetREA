package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zu9 implements av9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh60 f44999a;

    public zu9(sh60 sh60Var) {
        sh60Var.getClass();
        this.f44999a = sh60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu9) && this.f44999a == ((zu9) obj).f44999a;
    }

    public final int hashCode() {
        return this.f44999a.hashCode();
    }

    public final String toString() {
        return "OnShowBalance(onboarding=" + this.f44999a + Separators.RPAREN;
    }
}
