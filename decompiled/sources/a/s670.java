package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s670 implements y670 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31690a;
    public final int b;

    public s670(boolean z, int i) {
        this.f31690a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s670)) {
            return false;
        }
        s670 s670Var = (s670) obj;
        return this.f31690a == s670Var.f31690a && this.b == s670Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f31690a) * 31);
    }

    public final String toString() {
        return "OnKeyboardStateChange(visible=" + this.f31690a + ", heightPx=" + this.b + Separators.RPAREN;
    }
}
