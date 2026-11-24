package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dre implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6555a;
    public final zrm b;
    public final String c;

    public dre(int i, zrm zrmVar) {
        this.f6555a = i;
        this.b = zrmVar;
        this.c = String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dre)) {
            return false;
        }
        dre dreVar = (dre) obj;
        return this.f6555a == dreVar.f6555a && this.b.equals(dreVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6555a) * 31);
    }

    public final String toString() {
        return "CountryOptionUiItem(countryId=" + this.f6555a + ", sportCellStyle=" + this.b + Separators.RPAREN;
    }
}
