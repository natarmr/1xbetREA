package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t7f0 implements u7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7f0 f33463a;

    public t7f0(q7f0 q7f0Var) {
        this.f33463a = q7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7f0) && this.f33463a == ((t7f0) obj).f33463a;
    }

    public final int hashCode() {
        return this.f33463a.hashCode();
    }

    public final String toString() {
        return "OnRegistrationTypeClick(registrationType=" + this.f33463a + Separators.RPAREN;
    }
}
