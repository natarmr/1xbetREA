package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pzr0 extends w8b {
    public final String d;

    public pzr0() {
        super(new h9b(""), null, null, 30);
        this.d = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzr0) && this.d.equals(((pzr0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("Empty(title=", this.d, Separators.RPAREN);
    }
}
