package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38274a;
    public final int b;

    public vz(int i, int i2) {
        this.f38274a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return this.f38274a == vzVar.f38274a && this.b == vzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f38274a) * 31);
    }

    public final String toString() {
        return ohs0.m("ShowRegionChoiceItemDialog(selectedRegionId=", this.f38274a, ", selectedCountryId=", Separators.RPAREN, this.b);
    }
}
