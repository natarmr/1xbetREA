package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f169a;

    public a3f0(u0f0 u0f0Var) {
        this.f169a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3f0) && this.f169a == ((a3f0) obj).f169a;
    }

    public final int hashCode() {
        return this.f169a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardNextClick(registrationFieldType=" + this.f169a + Separators.RPAREN;
    }
}
