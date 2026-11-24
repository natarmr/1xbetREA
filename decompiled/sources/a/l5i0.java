package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19458a;
    public final String b;

    public l5i0(String str, String str2) {
        this.f19458a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5i0)) {
            return false;
        }
        l5i0 l5i0Var = (l5i0) obj;
        return this.f19458a.equals(l5i0Var.f19458a) && this.b.equals(l5i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19458a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SelectorModel(id=", this.f19458a, ", title=", this.b, Separators.RPAREN);
    }
}
