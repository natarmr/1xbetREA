package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class moy implements ooy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22152a;
    public final int b;

    public moy(int i, int i2) {
        this.f22152a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moy)) {
            return false;
        }
        moy moyVar = (moy) obj;
        return this.f22152a == moyVar.f22152a && this.b == moyVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f22152a) * 31);
    }

    public final String toString() {
        return ohs0.m("SecondPlayerCardSize(size=", this.f22152a, ", background=", Separators.RPAREN, this.b);
    }
}
