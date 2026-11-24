package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27822a;
    public final int b;

    public pz(int i, int i2) {
        this.f27822a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz)) {
            return false;
        }
        pz pzVar = (pz) obj;
        return this.f27822a == pzVar.f27822a && this.b == pzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f27822a) * 31);
    }

    public final String toString() {
        return ohs0.m("ShowCityChoiceItemDialog(selectedCityId=", this.f27822a, ", selectedRegionId=", Separators.RPAREN, this.b);
    }
}
