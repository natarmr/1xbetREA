package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rxk0 {
    public static final rxk0 c = new rxk0("", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31269a;
    public final String b;

    public rxk0(String str, boolean z) {
        this.f31269a = z;
        this.b = str;
    }

    public static rxk0 a(rxk0 rxk0Var) {
        String str = rxk0Var.b;
        rxk0Var.getClass();
        return new rxk0(str, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxk0)) {
            return false;
        }
        rxk0 rxk0Var = (rxk0) obj;
        return this.f31269a == rxk0Var.f31269a && this.b.equals(rxk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f31269a) * 31);
    }

    public final String toString() {
        return ua80.k("SpinAllButtonState(isVisible=", this.f31269a, ", spinText=", this.b, Separators.RPAREN);
    }
}
