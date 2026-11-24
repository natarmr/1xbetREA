package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vfh implements xfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37331a;
    public final int b;

    public vfh(int i, int i2) {
        this.f37331a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfh)) {
            return false;
        }
        vfh vfhVar = (vfh) obj;
        return this.f37331a == vfhVar.f37331a && this.b == vfhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f37331a) * 31);
    }

    public final String toString() {
        return ohs0.m("Icon(image=", this.f37331a, ", color=", Separators.RPAREN, this.b);
    }
}
