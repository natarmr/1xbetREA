package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class szr0 extends w8b {
    public final String d;

    public szr0() {
        super(new h9b(""), null, null, 30);
        this.d = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szr0) && this.d.equals(((szr0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("Group(title=", this.d, Separators.RPAREN);
    }
}
