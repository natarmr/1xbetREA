package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f29383a;

    public qve0(u0f0 u0f0Var) {
        this.f29383a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qve0) && this.f29383a == ((qve0) obj).f29383a;
    }

    public final int hashCode() {
        return this.f29383a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardNextClick(registrationFieldType=" + this.f29383a + Separators.RPAREN;
    }
}
