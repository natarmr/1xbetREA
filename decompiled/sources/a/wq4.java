package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kvl f39572a;
    public final yq4 b;

    public wq4(kvl kvlVar, yq4 yq4Var) {
        this.f39572a = kvlVar;
        this.b = yq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq4)) {
            return false;
        }
        wq4 wq4Var = (wq4) obj;
        return this.f39572a.equals(wq4Var.f39572a) && this.b.equals(wq4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39572a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthenticatorOptionUiModel(style=" + this.f39572a + ", action=" + this.b + Separators.RPAREN;
    }
}
