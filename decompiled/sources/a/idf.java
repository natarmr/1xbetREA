package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class idf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14582a;
    public final String b;

    public idf(String str, String str2) {
        this.f14582a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idf)) {
            return false;
        }
        idf idfVar = (idf) obj;
        return this.f14582a.equals(idfVar.f14582a) && this.b.equals(idfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14582a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CricketPointsUiModel(runs=", this.f14582a, ", points=", this.b, Separators.RPAREN);
    }
}
