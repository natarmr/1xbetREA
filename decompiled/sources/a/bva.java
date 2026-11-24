package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bva extends v8b {
    public final String d;
    public final String e;

    public bva(String str, String str2) {
        super(30, null, null, q3d.j(new f9b(10), new h9b(str)));
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bva)) {
            return false;
        }
        bva bvaVar = (bva) obj;
        return this.d.equals(bvaVar.d) && this.e.equals(bvaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(value=", this.d, ", teamLogo=", this.e, Separators.RPAREN);
    }
}
