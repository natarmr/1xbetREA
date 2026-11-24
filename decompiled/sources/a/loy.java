package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class loy implements ooy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20413a;
    public final int b;

    public loy(int i, int i2) {
        this.f20413a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loy)) {
            return false;
        }
        loy loyVar = (loy) obj;
        return this.f20413a == loyVar.f20413a && this.b == loyVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f20413a) * 31);
    }

    public final String toString() {
        return ohs0.m("FirstPlayerCardSize(size=", this.f20413a, ", background=", Separators.RPAREN, this.b);
    }
}
