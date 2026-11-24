package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rfp extends t9p {
    public final String b;
    public final ftr c;

    public rfp(String str, ftr ftrVar) {
        super(str, ftrVar.f10128a);
        this.b = str;
        this.c = ftrVar;
    }

    public static rfp c(rfp rfpVar, ftr ftrVar) {
        String str = rfpVar.b;
        rfpVar.getClass();
        return new rfp(str, ftrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfp)) {
            return false;
        }
        rfp rfpVar = (rfp) obj;
        return this.b.equals(rfpVar.b) && this.c.equals(rfpVar.c);
    }

    public final int hashCode() {
        return this.c.f10128a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "FavouriteGameCardCollection(id=" + this.b + ", content=" + this.c + Separators.RPAREN;
    }
}
