package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q0c0 implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rue0 f27890a;

    public q0c0(rue0 rue0Var) {
        this.f27890a = rue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0c0) && this.f27890a.equals(((q0c0) obj).f27890a);
    }

    public final int hashCode() {
        return this.f27890a.hashCode();
    }

    public final String toString() {
        return "OnLocationSelected(registrationChoice=" + this.f27890a + Separators.RPAREN;
    }
}
