package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dqs extends az5 {
    public final int c;
    public final String d;

    public dqs(int i, String str) {
        super(i, str);
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqs)) {
            return false;
        }
        dqs dqsVar = (dqs) obj;
        return this.c == dqsVar.c && this.d.equals(dqsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.c, "GameResult(gameId=", ", name=", this.d, Separators.RPAREN);
    }
}
