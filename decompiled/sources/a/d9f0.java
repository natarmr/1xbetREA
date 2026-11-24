package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f5698a;

    public d9f0(u0f0 u0f0Var) {
        this.f5698a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9f0) && this.f5698a == ((d9f0) obj).f5698a;
    }

    public final int hashCode() {
        return this.f5698a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardNextClick(registrationFieldType=" + this.f5698a + Separators.RPAREN;
    }
}
