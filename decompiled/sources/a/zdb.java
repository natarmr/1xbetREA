package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44204a;
    public final String b;

    public zdb(String str, String str2) {
        this.f44204a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdb)) {
            return false;
        }
        zdb zdbVar = (zdb) obj;
        return this.f44204a.equals(zdbVar.f44204a) && this.b.equals(zdbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44204a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ChampMenuSelectorModel(id=", this.f44204a, ", title=", this.b, Separators.RPAREN);
    }
}
