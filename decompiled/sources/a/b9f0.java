package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f2206a;

    public b9f0(u0f0 u0f0Var) {
        this.f2206a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9f0) && this.f2206a == ((b9f0) obj).f2206a;
    }

    public final int hashCode() {
        return this.f2206a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardDoneClick(registrationFieldType=" + this.f2206a + Separators.RPAREN;
    }
}
