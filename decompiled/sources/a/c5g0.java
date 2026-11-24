package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3771a;
    public final String b;

    public c5g0(String str, String str2) {
        this.f3771a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5g0)) {
            return false;
        }
        c5g0 c5g0Var = (c5g0) obj;
        return this.f3771a.equals(c5g0Var.f3771a) && this.b.equals(c5g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3771a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ResultValue(title=", this.f3771a, ", value=", this.b, Separators.RPAREN);
    }
}
