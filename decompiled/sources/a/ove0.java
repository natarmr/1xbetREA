package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ove0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f25921a;

    public ove0(u0f0 u0f0Var) {
        this.f25921a = u0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ove0) && this.f25921a == ((ove0) obj).f25921a;
    }

    public final int hashCode() {
        return this.f25921a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardDoneClick(registrationFieldType=" + this.f25921a + Separators.RPAREN;
    }
}
