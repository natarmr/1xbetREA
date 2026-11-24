package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l48 implements n48 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19391a;
    public final String b;

    public l48(String str, String str2) {
        this.f19391a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l48)) {
            return false;
        }
        l48 l48Var = (l48) obj;
        return this.f19391a.equals(l48Var.f19391a) && this.b.equals(l48Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19391a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("BiographyDataUiModel(title=", this.f19391a, ", value=", this.b, Separators.RPAREN);
    }
}
