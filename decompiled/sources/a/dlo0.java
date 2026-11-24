package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dlo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6294a;
    public final String b;

    public dlo0(String str, String str2) {
        this.f6294a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlo0)) {
            return false;
        }
        dlo0 dlo0Var = (dlo0) obj;
        return this.f6294a.equals(dlo0Var.f6294a) && this.b.equals(dlo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6294a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TableRowTitleModel(playerName=", this.f6294a, ", partnerName=", this.b, Separators.RPAREN);
    }
}
