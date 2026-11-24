package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ioy implements ooy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15137a;
    public final String b;

    public ioy(String str, String str2) {
        this.f15137a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioy)) {
            return false;
        }
        ioy ioyVar = (ioy) obj;
        return this.f15137a.equals(ioyVar.f15137a) && this.b.equals(ioyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15137a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Background(gameFieldBackground=", this.f15137a, ", jokerBackground=", this.b, Separators.RPAREN);
    }
}
