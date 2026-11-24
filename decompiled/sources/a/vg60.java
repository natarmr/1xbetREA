package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vg60 implements xg60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37368a;
    public final int b;

    public vg60(int i, int i2) {
        this.f37368a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg60)) {
            return false;
        }
        vg60 vg60Var = (vg60) obj;
        return this.f37368a == vg60Var.f37368a && this.b == vg60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f37368a) * 31);
    }

    public final String toString() {
        return ohs0.m("DocumentDialog(countryId=", this.f37368a, ", selectedDocumentId=", Separators.RPAREN, this.b);
    }
}
