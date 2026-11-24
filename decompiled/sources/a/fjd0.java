package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fjd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9635a;
    public final boolean b;

    public fjd0(String str, boolean z) {
        this.f9635a = str;
        this.b = z;
    }

    public static fjd0 a(fjd0 fjd0Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = fjd0Var.f9635a;
        }
        if ((i & 2) != 0) {
            z = fjd0Var.b;
        }
        fjd0Var.getClass();
        return new fjd0(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjd0)) {
            return false;
        }
        fjd0 fjd0Var = (fjd0) obj;
        return this.f9635a.equals(fjd0Var.f9635a) && this.b == fjd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9635a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("UiState(mail=", this.f9635a, ", networkConnected=", this.b, Separators.RPAREN);
    }
}
