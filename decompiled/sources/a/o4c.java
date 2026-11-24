package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o4c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24626a;
    public final String b;

    public o4c(s4c s4cVar) {
        String str = s4cVar.f31597a;
        str = str == null ? "" : str;
        String str2 = s4cVar.b;
        String str3 = str2 != null ? str2 : "";
        this.f24626a = str;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4c)) {
            return false;
        }
        o4c o4cVar = (o4c) obj;
        return this.f24626a.equals(o4cVar.f24626a) && this.b.equals(o4cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24626a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CheckPhone(countryCode=", this.f24626a, ", phoneNumber=", this.b, Separators.RPAREN);
    }
}
