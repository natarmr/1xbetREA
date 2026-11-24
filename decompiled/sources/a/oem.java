package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class oem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25129a;
    public final boolean b;

    public oem(int i, boolean z) {
        this.f25129a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oem)) {
            return false;
        }
        oem oemVar = (oem) obj;
        return this.f25129a == oemVar.f25129a && this.b == oemVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f25129a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f25129a, "DsEventCardDiceCellModel(diceResId=", ", enabled=", Separators.RPAREN, this.b);
    }
}
