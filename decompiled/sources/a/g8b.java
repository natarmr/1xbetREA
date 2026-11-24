package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g8b extends az5 {
    public final int c;
    public final String d;

    public g8b(int i, String str) {
        super(i, str);
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8b)) {
            return false;
        }
        g8b g8bVar = (g8b) obj;
        return this.c == g8bVar.c && this.d.equals(g8bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.c, "CategoryResult(categoryId=", ", name=", this.d, Separators.RPAREN);
    }
}
