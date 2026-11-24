package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class edf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7614a;
    public final String b;

    public edf(String str, String str2) {
        this.f7614a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edf)) {
            return false;
        }
        edf edfVar = (edf) obj;
        return this.f7614a.equals(edfVar.f7614a) && this.b.equals(edfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7614a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CricketPointsModel(runs=", this.f7614a, ", points=", this.b, Separators.RPAREN);
    }
}
