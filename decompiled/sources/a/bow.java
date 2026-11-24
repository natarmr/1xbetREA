package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bow extends w8b {
    public final String d;

    public bow(String str) {
        super(new h9b(str), null, null, 30);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bow) && this.d.equals(((bow) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("DataCell(value=", this.d, Separators.RPAREN);
    }
}
