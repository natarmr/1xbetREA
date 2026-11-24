package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ipf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15160a;
    public final float b;

    public ipf(float f, float f2) {
        this.f15160a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipf)) {
            return false;
        }
        ipf ipfVar = (ipf) obj;
        return Float.compare(this.f15160a, ipfVar.f15160a) == 0 && Float.compare(this.b, ipfVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f15160a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f15160a, this.b, "Cs2MapSplitOffset(xOffset=", ", yOffset=", Separators.RPAREN);
    }
}
