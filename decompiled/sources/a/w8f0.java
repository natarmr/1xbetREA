package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f38719a;

    public w8f0(u0f0 u0f0Var) {
        this.f38719a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8f0) && this.f38719a == ((w8f0) obj).f38719a;
    }

    public final int hashCode() {
        return this.f38719a.hashCode();
    }

    public final String toString() {
        return "OnCheckBoxFieldClick(registrationFieldType=" + this.f38719a + Separators.RPAREN;
    }
}
