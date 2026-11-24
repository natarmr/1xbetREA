package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tlc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlc f34135a;
    public final int b;

    public tlc(qlc qlcVar, int i) {
        this.f34135a = qlcVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlc)) {
            return false;
        }
        tlc tlcVar = (tlc) obj;
        return this.f34135a.equals(tlcVar.f34135a) && this.b == tlcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f34135a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f34135a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Separators.GREATER_THAN);
        }
        return sb.toString();
    }
}
