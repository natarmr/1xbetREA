package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xu9 implements av9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh60 f41498a;

    public xu9(sh60 sh60Var) {
        sh60Var.getClass();
        this.f41498a = sh60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu9) && this.f41498a == ((xu9) obj).f41498a;
    }

    public final int hashCode() {
        return this.f41498a.hashCode();
    }

    public final String toString() {
        return "OnCompleteOnboarding(onboarding=" + this.f41498a + Separators.RPAREN;
    }
}
