package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f17200a;

    public jve0(u0f0 u0f0Var) {
        this.f17200a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jve0) && this.f17200a == ((jve0) obj).f17200a;
    }

    public final int hashCode() {
        return this.f17200a.hashCode();
    }

    public final String toString() {
        return "OnCheckBoxFieldClick(registrationFieldType=" + this.f17200a + Separators.RPAREN;
    }
}
