package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tih0 extends w8b {
    public final String d;

    public tih0(String str) {
        super(new h9b(str), null, null, 30);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tih0) && this.d.equals(((tih0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("SeasonCell(value=", this.d, Separators.RPAREN);
    }
}
