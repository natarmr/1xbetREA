package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f41901a;

    public y2f0(u0f0 u0f0Var) {
        this.f41901a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2f0) && this.f41901a == ((y2f0) obj).f41901a;
    }

    public final int hashCode() {
        return this.f41901a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardDoneClick(registrationFieldType=" + this.f41901a + Separators.RPAREN;
    }
}
