package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cfp0 implements efp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4275a;
    public final String b;

    public cfp0(String str, String str2) {
        this.f4275a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfp0)) {
            return false;
        }
        cfp0 cfp0Var = (cfp0) obj;
        return this.f4275a.equals(cfp0Var.f4275a) && this.b.equals(cfp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4275a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PairTeamLogosUiModel(firstPlayerLogo=", this.f4275a, ", secondPlayerLogo=", this.b, Separators.RPAREN);
    }
}
