package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cw50 extends dw50 {
    public final String d;

    public cw50(String str) {
        super(str, "", "");
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw50) && this.d.equals(((cw50) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("Loading(bannerTitle=", this.d, Separators.RPAREN);
    }
}
