package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f34943a;

    public u2f0(u0f0 u0f0Var) {
        this.f34943a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2f0) && this.f34943a == ((u2f0) obj).f34943a;
    }

    public final int hashCode() {
        return this.f34943a.hashCode();
    }

    public final String toString() {
        return "OnCheckBoxFieldClick(registrationFieldType=" + this.f34943a + Separators.RPAREN;
    }
}
