package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xtr implements ytr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41476a;
    public final String b;

    public xtr(String str, String str2) {
        this.f41476a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtr)) {
            return false;
        }
        xtr xtrVar = (xtr) obj;
        return this.f41476a.equals(xtrVar.f41476a) && this.b.equals(xtrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41476a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GlobalChamp(sportIconUrl=", this.f41476a, ", globalChampIconUrl=", this.b, Separators.RPAREN);
    }
}
