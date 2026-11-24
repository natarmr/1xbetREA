package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27154a;
    public final int b;

    public pkv0(String str, int i) {
        this.f27154a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkv0)) {
            return false;
        }
        pkv0 pkv0Var = (pkv0) obj;
        return this.f27154a.equals(pkv0Var.f27154a) && this.b == pkv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f27154a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "WinterGameMenu(name=", this.f27154a, ", type=", Separators.RPAREN);
    }
}
