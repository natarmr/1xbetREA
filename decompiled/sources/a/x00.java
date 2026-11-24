package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40044a;
    public final String b;

    public x00(String str, String str2) {
        this.f40044a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        return this.f40044a.equals(x00Var.f40044a) && this.b.equals(x00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40044a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AdditionalTopUiModel(iconUrl=", this.f40044a, ", label=", this.b, Separators.RPAREN);
    }
}
