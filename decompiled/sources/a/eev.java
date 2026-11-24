package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7692a;
    public final int b;

    public eev(int i, int i2) {
        this.f7692a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eev)) {
            return false;
        }
        eev eevVar = (eev) obj;
        return this.f7692a == eevVar.f7692a && this.b == eevVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7692a) * 31);
    }

    public final String toString() {
        return ohs0.m("GraphPointModel(value=", this.f7692a, ", seconds=", Separators.RPAREN, this.b);
    }
}
