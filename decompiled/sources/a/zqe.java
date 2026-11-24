package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zqe {
    public static final zqe c = new zqe("", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44804a;
    public final String b;

    public zqe(String str, String str2) {
        this.f44804a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqe)) {
            return false;
        }
        zqe zqeVar = (zqe) obj;
        return this.f44804a.equals(zqeVar.f44804a) && this.b.equals(zqeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44804a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CountryModel(title=", this.f44804a, ", image=", this.b, Separators.RPAREN);
    }
}
