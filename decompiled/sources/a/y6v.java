package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y6v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7v f42119a;
    public final int b;

    public y6v(d7v d7vVar, int i) {
        this.f42119a = d7vVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6v)) {
            return false;
        }
        y6v y6vVar = (y6v) obj;
        return this.f42119a == y6vVar.f42119a && this.b == y6vVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f42119a.hashCode() * 31);
    }

    public final String toString() {
        return "GiftChipsModel(chipType=" + this.f42119a + ", chipValue=" + this.b + Separators.RPAREN;
    }
}
